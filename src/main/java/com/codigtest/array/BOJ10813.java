package com.codigtest.array;

import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            int temp = arr[c - 1];
            arr[c - 1] = arr[d - 1];
            arr[d - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
