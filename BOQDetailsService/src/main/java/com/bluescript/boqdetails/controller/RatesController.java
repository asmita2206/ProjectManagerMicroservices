package com.bluescript.boqdetails.controller;

import com.bluescript.boqdetails.entity.RatesEntity;
import com.bluescript.boqdetails.response.RatesDeleteResponse;
import com.bluescript.boqdetails.service.RatesService;
import com.bluescript.boqdetails.request.RatesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Rates")
public class RatesController {

    @Autowired
    RatesService ratesService;

    @PostMapping
    public RatesEntity createRates(@RequestBody RatesRequest ratesRequest){
        return ratesService.createRates(ratesRequest);
    }

    @GetMapping("/{ratesId}")
    public RatesEntity getRates(@PathVariable ("ratesId")String ratesId){
        return ratesService.getRates(ratesId);
    }

    @DeleteMapping("/{ratesId}")
    public RatesDeleteResponse deleteRates(@PathVariable("ratesId") String ratesId){
        return ratesService.deleteRates(ratesId);
    }

    @PutMapping("/{ratesId}")
    public RatesEntity updateRates(@PathVariable ("ratesId") String ratesId,@RequestBody RatesRequest ratesRequest){
        return ratesService.updateRates(ratesId,ratesRequest);
    }
}
