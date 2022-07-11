package com.cipherSchool.class4;

import java.util.Scanner;
// Cab Fare Calulation Project!
class Cab {
    int fare;
    public Cab() {
        fare = 40;
    }
    void calculateFare() {
        int travel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The travel Travelled by User: ");
        travel = sc.nextInt();

        fare += travel * 10;
    }
    void showFare() {
        System.out.println("Total Fare To Be Paid: " + fare);
    }
}

class RideCab {
    void putOtp() {
        System.out.println("Ride Started !");
        Cab ob = new Cab();
        System.out.println("Ride Ended!!");
        ob.calculateFare();
        ob.showFare();
    }

    public static void main(String[] args) {
        RideCab rc = new RideCab();
        rc.putOtp();
    }
}
/*
 * */
