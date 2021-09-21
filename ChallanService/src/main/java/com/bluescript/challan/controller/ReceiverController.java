package com.bluescript.challan.controller;

import com.bluescript.challan.entity.ReceiverEntity;
import com.bluescript.challan.request.ReceiverRequest;
import com.bluescript.challan.response.ReceiverDeleteResponse;
import com.bluescript.challan.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Receiver")
public class ReceiverController {

    @Autowired
    ReceiverService receiverService;

    @PostMapping
    public ReceiverEntity createReceiver(@RequestBody ReceiverRequest receiverRequest){
        return receiverService.createReceiver(receiverRequest);
    }

    @GetMapping("/{receiverId}")
    public ReceiverEntity getReceiver(@PathVariable ("receiverId") String receiverId){
        return receiverService.getReceiver(receiverId);
    }

    @DeleteMapping("/{receiverId}")
    public ReceiverDeleteResponse deleteReceiver(@PathVariable ("receiverId") String receiverId){
        return receiverService.deleteReceiver(receiverId);
    }

    @PutMapping("/{receiverId}")
    public ReceiverEntity updateReceiver(@PathVariable ("receiverId") String receiverId,@RequestBody ReceiverRequest receiverRequest){
        return receiverService.updateReceiver(receiverId,receiverRequest);
    }
}
