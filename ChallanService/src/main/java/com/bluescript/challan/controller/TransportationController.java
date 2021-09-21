package com.bluescript.challan.controller;

import com.bluescript.challan.entity.TransportationEntity;
import com.bluescript.challan.request.TransportationRequest;
import com.bluescript.challan.response.TransportationDeleteResponse;
import com.bluescript.challan.service.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transporation")
public class TransportationController {

    @Autowired
    TransportationService transportationService;

    @PostMapping
    public TransportationEntity createTransport(@RequestBody TransportationRequest transportationRequest){
        return transportationService.createTransport(transportationRequest);
    }

    @GetMapping("/{transportationId}")
    public TransportationEntity getTransport(@PathVariable ("transportationId") String transportationId){
        return transportationService.getTransport(transportationId);
    }

    @DeleteMapping("/{transportationId}")
    public TransportationDeleteResponse deleteTransport(@PathVariable ("transportationId") String transportationId){
        return transportationService.deleteTransport(transportationId);
    }

    @PutMapping("/{transportationId}")
    public TransportationEntity updateTransport(@PathVariable ("transportationId") String transportationId, @RequestBody TransportationRequest transportationRequest){
        return transportationService.updateTransport(transportationId,transportationRequest);
    }
}
