package com.cipherSchool.class10;
import java.util.Scanner;

/*
 * Searching an Item in Array
 *
 * SEARCHING ALGOTRITHMS:
 * -Liner Searching - O(n)
 * -Binary Search   - O(log n)
 *
 * Note: PreRequisite for Binary Search is that the arrey should be Sorted
 *
 *
 * */
public class searching {
    static Scanner sc = new Scanner(System.in);
    static void input(int arr[]) {
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int lin_search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++){
            if (x==arr[i]){
                return i;
            }
        }
            return -1;
    }
    static int bin_search(int arr[], int x) {
        int beg = 0, end = arr.length, mid;
        while(beg <= end) {
            mid = (beg+end)/2;
            if (x==arr[mid]){
                return mid;
            }
            else if (x > arr[mid]){
                beg = mid + 1;
            }
            else
                end = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int array[], n,x,pos;

        System.out.println("Enter The Array Size: ");
        n = sc.nextInt();

        array = new int[n];
        input(array);

        System.out.println("Enter The Item to Serch: ");
        x = sc.nextInt();


//        pos = lin_search(array,x);
        pos = bin_search(array,x);
        if (pos != -1) {
            System.out.println("Item is present at position " + pos );
        }
        else System.out.println("Item not Found!");

    }
}
