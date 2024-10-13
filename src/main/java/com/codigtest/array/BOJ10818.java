package com.codigtest.array;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();

            if (b > max) {
                max = b;
            }

            if (b < min) {
                min = b;
            }
        }

        System.out.println(min + " " + max);
    }
}
