package org.example.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class CreatePackageRequest {
    private String description;
    private String senderName;
    private String senderPhoneNumber;
    private String receiverName;
    private String receiverPhoneNumber;
    private LocalDateTime localDateTime = LocalDateTime.now();

//    public LocalDateTime getLocalDateTime() {
//        return localDateTime;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getSenderName() {
//        return senderName;
//    }
//
//    public void setSenderName(String senderName) {
//        this.senderName = senderName;
//    }
//
//    public String getSenderPhoneNumber() {
//        return senderPhoneNumber;
//    }
//
//    public void setSenderPhoneNumber(String senderPhoneNumber) {
//        this.senderPhoneNumber = senderPhoneNumber;
//    }
//
//    public String getReceiverName() {
//        return receiverName;
//    }
//
//    public void setReceiverName(String receiverName) {
//        this.receiverName = receiverName;
//    }
//
//    public String getReceiverPhoneNumber() {
//        return receiverPhoneNumber;
//    }
//
//    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
//        this.receiverPhoneNumber = receiverPhoneNumber;
//    }

    @Override
    public String toString() {
        return description + senderName + senderPhoneNumber + receiverName + receiverPhoneNumber + localDateTime;
    }
}
