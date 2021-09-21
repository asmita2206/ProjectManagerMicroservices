package com.bluescript.challan.service;

import com.bluescript.challan.constants.StringConstants;
import com.bluescript.challan.entity.ReceiverEntity;
import com.bluescript.challan.exception.NoRecordFoundException;
import com.bluescript.challan.repository.ReceiverRepo;
import com.bluescript.challan.request.ReceiverRequest;
import com.bluescript.challan.response.ReceiverDeleteResponse;
import com.bluescript.challan.utils.ChallanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

    @Autowired
    ReceiverRepo receiverRepo;

    public ReceiverEntity createReceiver(ReceiverRequest receiverRequest) {

        String receiverId= ChallanUtils.generateId(StringConstants.receiverId_prefix);
        ReceiverEntity receiverEntity=new ReceiverEntity();
        receiverEntity.setReceiverId(receiverId);
        receiverEntity.setReceivedByUserId(receiverRequest.getReceivedByUserId());

        return receiverRepo.save(receiverEntity);
    }

    public ReceiverEntity getReceiver(String receiverId) {

        ReceiverEntity receiverEntity=receiverRepo.findByreceiverId(receiverId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +receiverId);
        });

        return receiverEntity;
    }

    public ReceiverDeleteResponse deleteReceiver(String receiverId) {

        ReceiverEntity receiverEntity=receiverRepo.findByreceiverId(receiverId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +receiverId);
        });

        ReceiverDeleteResponse deleteResponse=new ReceiverDeleteResponse(receiverId,true);
        receiverRepo.delete(receiverEntity);
        return deleteResponse;
    }

    public ReceiverEntity updateReceiver(String receiverId, ReceiverRequest receiverRequest) {

        ReceiverEntity receiverEntity=receiverRepo.findByreceiverId(receiverId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +receiverId);
        });

        receiverEntity.setReceivedByUserId(receiverRequest.getReceivedByUserId());
        receiverEntity.getReceiverId();
        return receiverRepo.save(receiverEntity);
    }
}
