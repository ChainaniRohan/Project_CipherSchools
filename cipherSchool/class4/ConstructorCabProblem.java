package com.cipherSchool.class4;

import com.sun.xml.internal.bind.v2.util.EditDistance;

import java.util.Scanner;
// Cab Fare Calulation Project!
/*
class Cab2 {
    int fare;
    public Cab2() {
        fare = 40;
    }
    public Cab2 (int amt) {
        fare = amt;
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

class RideCab2 {
    void putOtp(int d) {
        System.out.println("Ride Started !");
        if (d <= 5) {
            Cab2 ob = new Cab2();
            System.out.println("Ride Ended!!");
            ob.calculateFare();
            ob.showFare();
        }
        else {
            Cab2 ob = new Cab2(40 + (d - 5) + 10 );
            System.out.println("Ride Ended!!");
            ob.calculateFare();
            ob.showFare();
        }
    }

    public static void main(String[] args) {
        int distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Distance of cab from User: ");
        distance = sc.nextInt();
        RideCab rc = new RideCab();
        rc.putOtp(distance);
    }
}
*/

/*
class Test {
    int data;
    public Test () {}
    public Test (int val) {
        data = val;
    }
    void show() {
        System.out.println("Data : " + data);
    }
}
class TestDrive {
    public static void main(String[] args) {
//        Test ob = new Test();
//        ob.show();

        Test ob = new Test(35);
        ob.show();
    }
}
*/

/*
class Test {
    int data;
    public Test () {}
    public Test (int data) {
        this.data = data; // "this" returns refernce of current object!
        //here we have confusion in data member and parameter therefore we use this keyword!
        //because local variable has highest priorty so it will access the local variable insted of data member!
    }
    void show() {
        System.out.println("Data : " + data);
    }
}
class TestDrive {
    public static void main(String[] args) {
//        Test ob = new Test();
//        ob.show();

        Test ob = new Test(35);
        ob.show();
    }

}
*/

/*
class Dummy {
    int data;

    void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data: ");
        data = sc.nextInt();
    }

    void show() {
        if(data < 25) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Data is less than 25 Plese re-enter! : ");
            data = sc.nextInt();
            System.out.println("Data : " + data);
        }
        else {
            System.out.println("Data : " + data);
        }
    }

    public static void main(String[] args) {
        Dummy ob = new Dummy();
        ob.update();
        ob.show();
    }
}
*/


class Dummy {
    int data;
    Scanner sc = new Scanner(System.in);

    void update() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data: ");
        data = sc.nextInt();
    }

    void show() {
        if(data < 25) {
//            Scanner sc = new Scanner(System.in);
            System.out.println("Data is less than 25 Plese re-enter! : ");
            data = sc.nextInt();
            System.out.println("Data : " + data);
        }
        else {
            System.out.println("Data : " + data);
        }
    }

    public static void main(String[] args) {
        Dummy ob = new Dummy();
        ob.update();
        ob.show();
    }
}
