package com.cipherSchool.class11_12;

import java.util.Scanner;
import java.util.Arrays;

public class sort {
    static Scanner sc = new Scanner(System.in);

    static void input(int arr[]) {
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void display(int arr[]) {
        System.out.print("Array Elements are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int arr[]) {
        int temp, n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            //          for (int j = 0; j < n - 1; j++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void enhancedBubbleSort(int arr[]) {
        int temp, n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void selectionSort(int arr[]) {
        int n = arr.length, pos, temp;
        for (int i = 0; i < n - 1; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    static int partition(int arr[], int p, int r) {
        int temp;
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    static void QuickSort(int arr[], int p, int r) {
        int q;
        if (p < r) {
            q = partition(arr, p, r);
            QuickSort(arr, p, q - 1);
            QuickSort(arr, q + 1, r);
        }

    }

    static void MergeSort(int arr[], int p, int r) {
        int q;
        if (p < r) {
            q = (p+r)/2;
            MergeSort(arr, p , q);
            MergeSort(arr, p+1 , r);
        }
    }

    static void merge(int a[], int p, int q, int r) {
        int n1, n2, i, j, k, L[], R[];
        n1 = q-p+1;
        n2 = r-q;

        L = new int[n1 +  1];
        R = new int[n2 +  1];

        for(i = 0; i<n1; i++) {
            L[i] = a[p+1];
        }
        for(j = 0; j < n2; j++) {
            R[j] = a[q+1+j];
        }

        L[n1] = R[n2] = 999999;

        i = j = 0;
        for(k = p; k <= r; k++) {
            if(L[i]<R[j]) {
                a[k] = L[i++];
            }
            else {
                a[k] = R[j++];
            }
        }
    }

    public static void main(String[] args) {
        int array[], n;

        System.out.println("Enter The Array Size: ");
        n = sc.nextInt();

        array = new int[n];
        input(array);


        display(array);
//        bubbleSort(array);
//        enhancedBubbleSort(array);
//        selectionSort(array);
//        InsertionSort(array);
//        QuickSort(array, 0, n-1);
        MergeSort(array, 0, n-1);
        Arrays.sort(array);
        System.out.println();
        display(array);
    }

}