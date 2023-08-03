package org.example.dto.responses;

import java.time.LocalDateTime;

public class CreatePackageResponse {

    private int trackingId;
    private String info;
    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTrackingId() {
        return trackingId;
    }

    public String getInfo() {
        return info;
    }

    public void setTrackingId(int id) {
        this.trackingId = id;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info + date ;
    }
}


