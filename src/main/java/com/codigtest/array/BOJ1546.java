package com.codigtest.array;

import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();

            arr[i] = b;
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double sum = 0;
        for (int j : arr) {
            sum += ((double) j / (double) max) * 100;
        }

        System.out.println(sum / arr.length);
    }
}
