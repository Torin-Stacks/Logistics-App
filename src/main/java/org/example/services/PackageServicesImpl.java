package org.example.services;

import org.example.data.models.ContactInformation;
import org.example.data.models.Package;
import org.example.data.models.TrackingInformation;
import org.example.data.repositories.PackageRepository;
import org.example.data.repositories.PackageRepositoryImpl;
import org.example.dto.requests.AddTrackingInformationRequest;
import org.example.dto.requests.CreatePackageRequest;
import org.example.dto.responses.CreatePackageResponse;
import org.example.dto.responses.TrackingPackageResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PackageServicesImpl implements PackageServices {

    PackageRepository packageRepository = new PackageRepositoryImpl();
    TrackingInfoServices trackingInfoServices = new TrackingInfoServicesImpl();


    @Override
    public CreatePackageResponse createPackage(CreatePackageRequest request) {
        Package newPackage = new Package();
        newPackage.setDescription(request.getDescription());
        ContactInformation receiversInfo = new ContactInformation();
        receiversInfo.setName(request.getReceiverName());
        receiversInfo.setPhoneNumber(request.getReceiverPhoneNumber());
        newPackage.setReceiversInfo(receiversInfo);
        ContactInformation sendersInfo = new ContactInformation();
        sendersInfo.setName(request.getSenderName());
        sendersInfo.setPhoneNumber(request.getSenderPhoneNumber());
        newPackage.setSendersInfo(sendersInfo);
        Package savedPackage = packageRepository.save(newPackage);
        System.out.println(newPackage);

        AddTrackingInformationRequest addTrackInfoRequest = new AddTrackingInformationRequest();
        addTrackInfoRequest.setTrackingNumber(savedPackage.getId());
        addTrackInfoRequest.setInfo("order was created by " + request.getSenderName());
        trackingInfoServices.addTrackingInfo(addTrackInfoRequest);


        CreatePackageResponse response = new CreatePackageResponse();
        response.setTrackingId(savedPackage.getId());
        response.setInfo("order created by " + request.getSenderName());
        LocalDateTime localDateTime = request.getLocalDateTime();
        String date = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy").format(localDateTime);
        response.setDate(date);

        return response;

    }

    @Override
    public TrackingPackageResponse findPackageById(int trackingId) {
      Package result1 = packageRepository.findPackageById(trackingId);
      ArrayList<TrackingInformation> trackingInfos = trackingInfoServices.findTrackingInfoByPackageId(trackingId);
      TrackingPackageResponse response = new TrackingPackageResponse();
      response.setUpdates(trackingInfos);
      //response.setSendersName(result1.getSendersInfo().);
      return response;


    }


}
