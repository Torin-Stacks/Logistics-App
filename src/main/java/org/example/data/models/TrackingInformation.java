package org.example.data.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TrackingInformation {
    private int packageId;
    private int id;
    private String info;
    private LocalDateTime date = LocalDateTime.now();

    private LocalDateTime updatedDate = LocalDateTime.now();


//    public int getPackageId() {
//        return packageId;
//    }
//
//    public void setPackageId(int packageId) {
//        this.packageId = packageId;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
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
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
//
//    public LocalDateTime getUpdatedDate() {
//        return updatedDate;
//    }
//
//    public void setUpdatedDate(LocalDateTime updatedDate) {
//        this.updatedDate = updatedDate;
//    }
//
//    public PackageState getPackageState() {
//        return packageState;
//    }
//
//    public void setPackageState(PackageState packageState) {
//        this.packageState = packageState;
//    }
//
    @Override
    public String toString() {
        return packageId + info + date + updatedDate;
    }
}
