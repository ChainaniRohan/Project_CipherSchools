package com.cipherSchool.class10;

import java.util.Scanner;

public class reccursionBinarySearch {
    static Scanner sc = new Scanner(System.in);

    static void input (int arr[]) {
        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    static int binSearch (int arr[], int beg, int end, int x){
        if (beg > end)
        {
            int mid = (beg+end)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if ( x > arr[mid])
                return binSearch(arr,mid+1,end,x);
            else
            return binSearch(arr,beg,mid-1,x);
        }
        else return -1;
    }

    public static void main(String[] args) {
        int n,beg,end,x,pos;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        input(arr);

        System.out.println("Enter item to search: ");
        x = sc.nextInt();

        pos = binSearch(arr,arr[0],arr[n-1], x);
        if (pos != -1) {
            System.out.println("Item is present at position " + pos );
        }
        else System.out.println("Item not Found!");
    }
}
