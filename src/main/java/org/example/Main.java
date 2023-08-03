package org.example;

import org.example.controllers.PackageController;
import org.example.controllers.TrackingInformationSystemController;
import org.example.dto.requests.AddTrackingInformationRequest;
import org.example.dto.requests.CreatePackageRequest;
import org.example.dto.responses.AddTrackingInformationResponse;
import org.example.dto.responses.CreatePackageResponse;
import org.example.dto.responses.TrackingPackageResponse;

import java.util.Scanner;

public class Main {
    private  static Scanner input = new Scanner(System.in);

    private static PackageController packageController  = new PackageController();
    private static TrackingInformationSystemController trackingInformationSystemController = new TrackingInformationSystemController();
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu(){
        String menu = """
                press 1 to register a new Package
                press 2 to  Add tracking information
                press 3 to track an existing package""";
        System.out.println(menu);
       int userInput = input. nextInt();
       takeInput(userInput);
    }

    public static void takeInput(int UserInput){
        switch (UserInput){
            case 1: registerNewPackage();
            break;
            case 2: addTrackingInformation();
            break;
            case 3: trackAnExistingPackage();
            break;
        }

    }

    private static void registerNewPackage() {
        CreatePackageRequest createPackageRequest = new CreatePackageRequest();
        System.out.println("Enter sender name: ");
        createPackageRequest.setSenderName(input.next());
        System.out.println("Enter sender phoneNUmber: ");
        createPackageRequest.setSenderPhoneNumber(input.next());
        System.out.println("Enter receiver name: ");
        createPackageRequest.setReceiverName(input.next());
        System.out.println("Enter receiver phoneNUmber: ");
        createPackageRequest.setReceiverPhoneNumber(input.next());
        System.out.println("Enter package description: ");
        createPackageRequest.setDescription(input.next());

        CreatePackageResponse response = packageController.createPackage(createPackageRequest);
        System.out.println(response);

        displayMenu();
    }

    public static void addTrackingInformation(){
        AddTrackingInformationRequest addTrackingInformationRequest = new AddTrackingInformationRequest();
        System.out.println("Enter tracking info: ");
        addTrackingInformationRequest.setInfo(input.next());
        System.out.println("Enter tracking number");
        addTrackingInformationRequest.setTrackingNumber(input.nextInt());

        AddTrackingInformationResponse response = trackingInformationSystemController.addTrackingInformationController(addTrackingInformationRequest);
        System.out.println(response);

        displayMenu();

    }

    public static void trackAnExistingPackage(){
        System.out.println("Enter tracking number: ");
        TrackingPackageResponse response= packageController.trackPackage(input.nextInt());
        System.out.println(response);

    }
}