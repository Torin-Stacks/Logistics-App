package org.example.data.repositories;


import org.example.data.models.Package;

import java.util.ArrayList;

public class PackageRepositoryImpl implements PackageRepository{
    private ArrayList<Package> packages = new ArrayList<>();
    private int initNum =1;

    @Override
    public Package save(Package newPackage) {
        if(newPackage.getId() == 0){
        newPackage.setId(generateId());
        packages.add(newPackage);
    }
        else {updatePackage(newPackage);}
       return newPackage;
}

    @Override
    public Package findPackageById(int trackingId) {
        for(Package pack:packages){
            if(pack.getId() == trackingId){
                return pack;
            }
        }
        return null;
    }

    private void updatePackage(Package newPackage) {
     int indexToBeUpdated = packages.indexOf(newPackage);
     packages.set(indexToBeUpdated, newPackage);
    }

    private int generateId() {
       return  initNum++;
    }
}
