package org.example.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class CreateTrackingInfoRequest {
    private int trackingId;

    private String info;

    private LocalDateTime localDateTime = LocalDateTime.now();

//    public LocalDateTime getLocalDateTime() {
//        return localDateTime;
//    }
//
//    public void setLocalDateTime(LocalDateTime localDateTime) {
//        this.localDateTime = localDateTime;
//    }
//
//    public int getTrackingId() {
//        return trackingId;
//    }
//
//    public void setTrackingId(int trackingId) {
//        this.trackingId = trackingId;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//
//    public void setInfo(String info) {
//        this.info = info;
//    }
//

}
