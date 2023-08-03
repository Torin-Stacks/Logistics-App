package org.example.data.repositories;

import org.example.data.models.Package;

public interface PackageRepository {
    Package save(Package newPackage);

    Package findPackageById(int trackingId);
}
