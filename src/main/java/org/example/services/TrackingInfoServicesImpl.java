package org.example.services;

import org.example.data.models.TrackingInformation;
import org.example.data.repositories.TrackingInfoRepository;
import org.example.data.repositories.TrackingInfoRepositoryImpl;
import org.example.dto.requests.AddTrackingInformationRequest;
import org.example.dto.responses.AddTrackingInformationResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TrackingInfoServicesImpl implements TrackingInfoServices {

    static TrackingInfoRepository trackingInfoRepository = new TrackingInfoRepositoryImpl();
    @Override
    public AddTrackingInformationResponse addTrackingInfo(AddTrackingInformationRequest request) {
        TrackingInformation trackingInformation = new TrackingInformation();
        trackingInformation.setPackageId((request.getTrackingNumber()));
        trackingInformation.setInfo(request.getInfo());
        TrackingInformation savedTrackingInfo = trackingInfoRepository.save(trackingInformation);



        AddTrackingInformationResponse response = new AddTrackingInformationResponse();
        response.setTrackingId(savedTrackingInfo.getPackageId());
        LocalDateTime localDateTime = trackingInformation.getDate();
        String date = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy").format(localDateTime);
        response.setDate(date);
        String time = DateTimeFormatter.ofPattern("hh:mm:ss a").format(localDateTime);
        response.setTime(time);
        System.out.println("Tracking information saved"  + savedTrackingInfo );
        return response;
    }



    @Override
    public ArrayList<TrackingInformation> findTrackingInfoByPackageId(int trackingId) {
        ArrayList<TrackingInformation> list = trackingInfoRepository. findTrackingInfoById(trackingId);
        return list;
    }

}
