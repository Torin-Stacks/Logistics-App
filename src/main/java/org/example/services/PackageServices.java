package org.example.services;

import org.example.dto.requests.CreatePackageRequest;
import org.example.dto.responses.CreatePackageResponse;
import org.example.dto.responses.TrackingPackageResponse;

public interface PackageServices {
CreatePackageResponse createPackage(CreatePackageRequest request);


TrackingPackageResponse findPackageById(int trackingId);
}
