package org.example.dto.requests;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AddTrackingInformationRequest {
    private int trackingNumber;
    private String info;
    private LocalDateTime timeEntered = LocalDateTime.now();
    private LocalDateTime dateEntered = LocalDateTime.now();
    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }}

//    public int getTrackingNumber() {
//        return trackingNumber;
//    }

//    public LocalDateTime getTimeEntered() {
//        return timeEntered;
//    }
//
//    public void setTimeEntered(LocalDateTime timeEntered) {
//        this.timeEntered = timeEntered;
//    }
//
//    public LocalDateTime getDateEntered() {
//        return dateEntered;
//    }
//
//    public void setDateEntered(LocalDateTime dateEntered) {
//        this.dateEntered = dateEntered;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }
//}
//
