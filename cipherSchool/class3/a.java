package com.cipherSchool.class3;

import java.util.Scanner;
/*
* PACKAGES IN JAVA!
* it is just like a folder. It may consisit of Sub-Packages and class files
* and interfaces.
*
* BUILT-IN Packages: lang, util, io, sql, net, awt, javax, etc.
* lang - The Default Package(so we need not to import it)
*
* User Defined Packages
*
* */
class Test {
    public static void main(String[] args) {
        String s;
        int roll;
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.print("Enter Roll no.: ");
        roll = sc.nextInt();
        System.out.println("Name: "+s);
        System.out.println("Roll no: "+roll);
    }
}
