package org.example.controllers;

import org.example.dto.requests.CreatePackageRequest;
import org.example.dto.responses.CreatePackageResponse;
import org.example.dto.responses.TrackingPackageResponse;
import org.example.services.PackageServices;
import org.example.services.PackageServicesImpl;

public class PackageController {

    PackageServices packageServices = new PackageServicesImpl();

    public CreatePackageResponse createPackage(CreatePackageRequest request){
        return packageServices.createPackage(request);
    }

   public TrackingPackageResponse trackPackage(int trackingId){
        return packageServices.findPackageById(trackingId);
    }

}
