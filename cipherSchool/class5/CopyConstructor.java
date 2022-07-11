package com.cipherSchool.class5;


class Test {
    int x;
    public Test() {
        x = 30;
    }
    public Test(int x) {
        this.x = x;
    }
    public Test(Test ob) {
        x = ob.x;
    }
    void show () {
        System.out.println("Data : " + x);
    }
}

class TestDriver {
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test(25);
        Test ob3 = ob2; // Shallow Copy!:if somethig is changed to ob2 it will reflect to ob3 and vise versa! it means both reflect to same object
        Test ob4 = new Test(ob2); // Deep copy: if something is chaned to one obj it wont affect other ! ,both will reflect to seperate object
        //copy constructor invoked!!
        ob1.show();
        ob2.show();
//        ob3.show();
        ob4.show();
        ob3.x = 45;
        ob2.show();
    }
}

/*
* Copy Constructor!
* It Copies data of one object to another!
* it is also a pramatrised constructor.
* eg:-
* class Test() {
*   Test(Test ob) { }
* }
* */
