package org.example.services;

import org.example.data.models.TrackingInformation;
import org.example.dto.requests.AddTrackingInformationRequest;
import org.example.dto.requests.CreateTrackingInfoRequest;
import org.example.dto.responses.AddTrackingInformationResponse;
import org.example.dto.responses.CreatePackageResponse;
import org.example.dto.responses.CreateTrackingInfoResponse;

import java.util.ArrayList;

public interface TrackingInfoServices {
    AddTrackingInformationResponse addTrackingInfo(AddTrackingInformationRequest request);

//    CreateTrackingInfoResponse createTrackingInfo(CreateTrackingInfoRequest request);

    ArrayList<TrackingInformation> findTrackingInfoByPackageId(int trackingId);

}
