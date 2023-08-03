package org.example.controllers;

import org.example.dto.requests.AddTrackingInformationRequest;
import org.example.dto.requests.CreateTrackingInfoRequest;
import org.example.dto.responses.AddTrackingInformationResponse;
import org.example.dto.responses.CreateTrackingInfoResponse;
import org.example.services.TrackingInfoServices;
import org.example.services.TrackingInfoServicesImpl;


public class TrackingInformationSystemController {

TrackingInfoServices trackingInfoServices = new TrackingInfoServicesImpl();
    public AddTrackingInformationResponse addTrackingInformationController(AddTrackingInformationRequest request){
        return trackingInfoServices.addTrackingInfo(request);
    }
}
