package org.example.data.models;

import lombok.Data;

@Data

   public class Package {
    private int id;
    private String description;
    private ContactInformation sendersInfo;
    private ContactInformation receiversInfo;




//   @Override
//    public boolean equals(Object o){
//
//   }
}
