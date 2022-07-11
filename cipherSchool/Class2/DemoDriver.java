package com.cipherSchool.Class2;
import com.cipherSchool.class3.Demo;
/*
public class DemoDriver {
    public static void main(String[] args) {
        com.cipherSchool.class3.Demo ob = new com.cipherSchool.class3.Demo();
        ob.c = 10;
        System.out.println("Data : "+ ob.c);
    }

}
*/
class DemoDriver extends com.cipherSchool.class3.Demo{
    public static void main(String[] args) {
        DemoDriver ob = new DemoDriver();
        ob.c = 45;
        System.out.println("Data  : " + ob.c);
    }
}



