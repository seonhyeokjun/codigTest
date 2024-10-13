package com.codigtest.array;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }

        int c = sc.nextInt();
        int count = 0;

        for (int i : arr) {
            if (i == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}
