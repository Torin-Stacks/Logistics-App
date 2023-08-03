package org.example.dto.responses;

import org.example.data.models.TrackingInformation;

import java.util.ArrayList;

public class TrackingPackageResponse {
    private ArrayList<TrackingInformation>  updates= new ArrayList<>();
    String dateAndTime;

    String SendersName;
    String receiversName;


    public String getSendersName() {
        return SendersName;
    }

    public void setSendersName(String sendersName) {
        SendersName = sendersName;
    }

    public String getReceiversName() {
        return receiversName;
    }

    public void setReceiversName(String receiversName) {
        this.receiversName = receiversName;
    }


    public ArrayList<TrackingInformation> getUpdates() {
        return updates;
    }

    public void setUpdates(ArrayList<TrackingInformation> updates) {
        this.updates = updates;
    }


    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
       String result = "";
       for(var update: updates){
           result+= update.toString()+ "\n";
       }
       return result;
    }
}

