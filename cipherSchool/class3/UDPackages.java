package com.cipherSchool.class3;

/*
package one;
class Demo {
    private int a;
//    protected int b;
//    public int c;
//    int d; //default

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.a = 20;
        System.out.println("Data : "+ ob.a);
    }

}

*/

// we can access private member of different class through th concept of Getters & Setters!!
//SETTERS AND GETTERS !

/*
class Demo {
    private int a;
//    protected int b;
//    public int c;
//    int d; //default
    void setA(int val){
        a = val;
    }
    int getA() {
        return a;
    }
}
class DemoDriver {
    public static void main(String[] args) {
        Demo ob = new Demo();
//        ob.a = 20;
        ob.setA(20);
//        System.out.println("Data : "+ ob.a);
        System.out.println("Data : "+ ob.getA());
    }

}
 */

/*
//ACCESSING PUBLIC MEMBER !
class Demo {
//    private int a;
//    protected int b;
    public int c;
//    int d; //default
}
class DemoDriver {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.c = 10;
        System.out.println("Data : "+ ob.c);
//        System.out.println("Data : "+ ob.getA());
    }

}
*/

//ACCESSING PROTECTED MEMBER !
// example of accessing the class of different package is in
// class3-demo and class2 DemoDriver !!
