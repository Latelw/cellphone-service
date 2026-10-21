package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Start scanner and call the Cellphone class

        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        //Ask the 5 questions

        System.out.print("What is the serial number?");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("What model is the phone?");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());





    }
}
