package com.codigtest.array;

import java.util.*;
import java.util.Scanner;

public class BOJ10811 {
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

            for (int j = c; j <= d; j++) {
                int k = --d;
                int tmp = arr[j - 1];
                arr[j - 1] = arr[k];
                arr[k] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
