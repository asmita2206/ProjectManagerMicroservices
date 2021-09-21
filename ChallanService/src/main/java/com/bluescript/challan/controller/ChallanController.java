package com.bluescript.challan.controller;

import com.bluescript.challan.entity.ChallanEntity;
import com.bluescript.challan.model.BOQDetailsEntity;
import com.bluescript.challan.request.ChallanRequest;
import com.bluescript.challan.response.ChallanDeleteResponse;
import com.bluescript.challan.service.ChallanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;

@RestController
@RequestMapping("/Challan")
public class ChallanController {

    @Autowired
    ChallanService challanService;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    private RestTemplate restTemplate=new RestTemplate();

    @PostMapping
    public ChallanEntity createChallan(@RequestBody ChallanRequest challanRequest){
        return challanService.createChallan(challanRequest);
    }

    @GetMapping("/{challanId}")
    public ChallanEntity getChallan(@PathVariable ("challanId") String challanId){
       return challanService.getChallan(challanId);
    }

    @DeleteMapping("/{challanId}")
    public ChallanDeleteResponse deleteChallan(@PathVariable ("challanId") String challanId){
        return challanService.deleteChallan(challanId);
    }

    @PutMapping("/{challanId}")
    public ChallanEntity updateChallan(@PathVariable ("challanId") String challanId, @RequestBody ChallanRequest challanRequest){
        return challanService.updateChallan(challanId,challanRequest);
    }

    private String getBaseUrl(){
        ServiceInstance instance=loadBalancerClient.choose("CHALLAN-SERVICE");
        return  instance.getUri().toString();
    }

    private String getUrlOfBOQ(){
        ServiceInstance instance=loadBalancerClient.choose("BOQ-SERVICE");
        return  instance.getUri().toString();
    }

    @GetMapping("/getBoq/{boqId}")
    public BOQDetailsEntity getBoq(@PathVariable("boqId") String boqId){
        try {
            return restTemplate.getForObject(getUrlOfBOQ()+"/BOQDetails/"+boqId,BOQDetailsEntity.class);
        }catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

    @GetMapping("/getChallanByeureka/{challanId}")
    public ChallanEntity getChallanByEureka(@PathVariable("challanId") String challanId){
        try {
            return restTemplate.getForObject(getBaseUrl()+"/Challan/"+challanId,ChallanEntity.class);
        }catch (Exception e){
           e.getStackTrace();
        }
        return null;
    }

}
