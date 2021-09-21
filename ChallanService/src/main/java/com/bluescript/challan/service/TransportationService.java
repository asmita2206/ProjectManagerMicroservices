package com.bluescript.challan.service;

import com.bluescript.challan.constants.StringConstants;
import com.bluescript.challan.entity.TransportationEntity;
import com.bluescript.challan.exception.NoRecordFoundException;
import com.bluescript.challan.repository.TransportationRepo;
import com.bluescript.challan.request.TransportationRequest;
import com.bluescript.challan.response.TransportationDeleteResponse;
import com.bluescript.challan.utils.ChallanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportationService {

    @Autowired
    TransportationRepo transportationRepo;

    public TransportationEntity createTransport(TransportationRequest transportationRequest) {

        String transportationId=ChallanUtils.generateId(StringConstants.transportationId_prefix);
        TransportationEntity transportationEntity=new TransportationEntity();

        transportationEntity.setTransportationId(transportationId);
        transportationEntity.setTransportationType(transportationRequest.getTransportationType());
        transportationEntity.setVehicleNumber(transportationRequest.getVehicleNumber());

        return transportationRepo.save(transportationEntity);
    }

    public TransportationEntity getTransport(String transportationId) {

        TransportationEntity transportationEntity=transportationRepo.findBytransportationId(transportationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +transportationId);
        });

        return transportationEntity;
    }

    public TransportationDeleteResponse deleteTransport(String transportationId) {

        TransportationEntity transportationEntity=transportationRepo.findBytransportationId(transportationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +transportationId);
        });

        TransportationDeleteResponse deleteResponse=new TransportationDeleteResponse(transportationId,true);
        transportationRepo.delete(transportationEntity);
        return deleteResponse;

    }

    public TransportationEntity updateTransport(String transportationId, TransportationRequest transportationRequest) {

        TransportationEntity transportationEntity=transportationRepo.findBytransportationId(transportationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +transportationId);
        });

        transportationEntity.getTransportationId();
        transportationEntity.setTransportationType(transportationRequest.getTransportationType());
        transportationEntity.setVehicleNumber(transportationRequest.getVehicleNumber());

        return transportationRepo.save(transportationEntity);

    }
}
