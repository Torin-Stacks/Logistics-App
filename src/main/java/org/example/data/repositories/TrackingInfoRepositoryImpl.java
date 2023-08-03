package org.example.data.repositories;
import org.example.data.models.TrackingInformation;

import java.util.ArrayList;

public class TrackingInfoRepositoryImpl implements TrackingInfoRepository {
    private ArrayList<TrackingInformation> trackingInformations = new ArrayList<>();
    int count = 1;

    @Override
    public TrackingInformation save(TrackingInformation trackingInformation) {
        if(trackingInformation.getId()==0){
            trackingInformation.setId(generateId());
        trackingInformations.add(trackingInformation);}

        return trackingInformation;
    }

    @Override
    public ArrayList<TrackingInformation> findTrackingInfoById(int trackingId) {
        ArrayList<TrackingInformation> list = new ArrayList<>();
        for(TrackingInformation trackingInformation: trackingInformations) {
            if (trackingInformation.getPackageId() == trackingId) {
                list.add(trackingInformation);
            }
        }
            return list;
   }
   private int generateId(){
        return count++;
   }

}
