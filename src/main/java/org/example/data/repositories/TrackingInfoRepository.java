package org.example.data.repositories;

import org.example.data.models.TrackingInformation;

import java.util.ArrayList;

public interface TrackingInfoRepository {
    TrackingInformation save(TrackingInformation trackingInformation);

    ArrayList<TrackingInformation> findTrackingInfoById(int trackingId);
}
