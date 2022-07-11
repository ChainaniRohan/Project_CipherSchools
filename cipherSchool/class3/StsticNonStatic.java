package com.cipherSchool.class3;

class TEEST{
    static int x;
    int y;

//    void show(){
//        System.out.println("Data: x = "+ x + " y = "+y);
//    }

    static void display(TEEST ob) {
//        System.out.println("Data : x = " + x + " y = " + y);
//        System.out.println("Data : x = " + TEEST.x + " y = ");
        System.out.println("Data : x = " + ob.x + " y = " + ob.y);
    }
}

class TestDrive {
    public static void main(String[] args) {
        TEEST ob = new TEEST();
        ob.x = 20;
        ob.y = 30;

        TEEST.display(ob);
    }
}

/*
* STATIC AND NON-STATIC METHODS !
*
*                       Non-Static Member         Static Member
*................................................................
 * Non-Static Method :      Object                  Object
 *                   :      Directly*               Class name
 *...............................................................
*                    :                              Object
* Static Method      :      Object                  Class name
*                    :                              Directly*
* ...............................................................
* (*): within the same class !
* '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
*/

/*
   CONSTRUCTOR!!
* class Test{
       //
    Test() {

    }
}
*
* Test ob = new Test(); // creates object !
*
* it will implicitly invoke test constructor and constructor will creat object.
* */


