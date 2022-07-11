package com.cipherSchool.class7;
/*
//Day 7
Exception Handling!!
Exception: the errors that ocurs while runtime!
        -> if Exception is not handled then it may raise and stop the further execution of program!!
        -> whenever Exception occurs, it abrutply terminates the program.
        -> We need to handle Exception to avoid this!

Throwable (kind of interface!) (child Classes:-)
-Exception : IOException, SQLException, ClassNotFoundException, RuntimeException
-Error : StackOverflowError, OutOfMemoryError, powerflowError

Types Of Exception:
1) Checked Exception: occurs at compile time!
2) Unchecked Exception: occurs at Runtime
3) Errors: Beyond Users Control!(it is something which we cannot do anything about)

* RuntimeException (and all its child Classes) are Unchecked Exception. …
[6:30 PM, 6/24/2022] ROHAN CHAINANI: /*
//Day 7
Exception Handling!!
Exception: the errors that ocurs while runtime!
        -> if Exception is not handled then it may raise and stop the further execution of program!!
        -> whenever Exception occurs, it abrutply terminates the program.
        -> We need to handle Exception to avoid this!

Throwable (kind of interface!) (child Classes:-)
-Exception : IOException, SQLException, ClassNotFoundException, RuntimeException
-Error : StackOverflowError, OutOfMemoryError, powerflowError

Types Of Exception:
1) Checked Exception: occurs at compile time!
2) Unchecked Exception: occurs at Runtime
3) Errors: Beyond Users Control!(it is something which we cannot do anything about)

* RuntimeException (and all its child Classes) are Unchecked Exception. (it is Responsibilyity of User!)
  (runTime can be avoided by User, it occurs due to carelessness of User)
* IOException, SQLException, ClassNotFoundException are Checked Exception.

RuntimeException: ArithmeticException,
                  NumberFormatException
                  NullPointerException
                  IndexOutOfBoundsException: ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException


KeyWords in Exception Handling: Try, Catch, finally, throw, throws!..



//Multiple Catch Block!
//one try{} can have multiple Catch(){}!


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b;
        String s = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a & b: ");
        a= sc.nextInt();
        b= sc.nextInt();
        try{
            System.out.println("Result: " + (a/b));
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println(e);
            // e.printStackTrace();
        }
        catch(NullPointerException n ) {
            System.out.println(n);
        }
        System.out.println("Task Over!");
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b;
        String s = "Hello";
        int arr[] = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a & b: ");
        a= sc.nextInt();
        b= sc.nextInt();
        try{
            System.out.println("Result: " + (a/b));
            System.out.println(s.length());
            System.out.println(arr[8]);
        }

        // catch(ArithmeticException e){
        //     System.out.println(e);
        //     // e.printStackTrace();
        // }

        // catch(NullPointerException n ) {
        //     System.out.println(n);
        // }

        // catch(ArrayIndexOutOfBoundsException ar){
        //     System.out.println(ar);
        // }

        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Task Over!");
    }
}

//Finally Block!
// contents of Finally Block is always executed no matter what.
// So, very important codes that must be executed must be in finally block.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b;
        String s = "Hello";
        int arr[] = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a & b: ");
        a= sc.nextInt();
        b= sc.nextInt();
        try{
            System.out.println("Result: " + (a/b));
            System.out.println(s.length());
            System.out.println(arr[8]);
        }

        finally {
            System.out.println("Some very Important codes that must be executed!");
        }

        System.out.println("Task Over!");
    }
}

IMP:- Final vs finally vs finalized

final: KeyWord(non-access modifier)(as static)
finally: block
finalized: method

final class cannot be inherited. final class Test
final method connot be overridden. final void show()
final variable cannot be changed. final int a = 25;

finalize(): it is invoked during garbage collection

System.gc() -> will call invoke finalize()



//Throw: uesd to genrate an execption!

import java.util.Scanner;

class screaning {
    float mark;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark: ");
        mark = sc.nextFloat();
    }
}

class Main{
    public static void main(String[] args) {
        screaning s = new screaning();
        s.input();

        if(s.mark >= 33){
            System.out.println("Pass!");
        }
        else {
            throw new ArithmeticException("Fail. ReAppear for Exam!");
        }
    }
}


// custom Exception (User Defined Exception)

import java.util.Scanner;

class resultException extends RuntimeException {
    resultException(String error) {
        super(error);
    }
}

class screaning {
    float mark;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark: ");
        mark = sc.nextFloat();
    }
}

class Main{
    public static void main(String[] args) {
        screaning s = new screaning();
        s.input();

        if(s.mark >= 33){
            System.out.println("Pass!");
        }
        else {
            throw new resultException("Fail. ReAppear for Exam!");
        }
    }
}

Exception Propagation

when a statement inside a function genrates an Exception
and it is not handled in the same function then that execption
propagates to the caller function.

// Exception Propagation! - Unchecked execption are propagated!
// it means execption can be handeled in parent class!
// to propagate checked Exception, we have to declare
// them by using throws with function signature!

main() {
    fun();
}

fun() {
    try{
        demo()
    }
}

demo() throws IOException{
    statement; // if this statement genrate Exception!
}



Scanner sc = new Scanner(System.in)
//Why passing System.in while creating Scanner Object

No default constructor in Scanner class,
so can't create Object by Scanner sc = new Scanner();

we are invoking constructor which needs inputStream class Object.
"in" is an Object of inputStream class.
It is present as static member of System class.
so, we pass System.in as argument while creating Scanner ovject
Hence, Scanner sc = new Scanner(System.in)


*/

// Equality Operator ==

class Main {
    public static void main(String[] args) {
        // int x,y;
        // x = 14;
        // y = 14;
        //true

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // System.out.println(s1 == s2);
        // false
        // because "==" compares the refrences and not content
        System.out.println(s1.equals(s2));
        // true
        // because "equals" compares the value

        String s3 = "Hello";
        String s4 = "Hello";
        // System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}