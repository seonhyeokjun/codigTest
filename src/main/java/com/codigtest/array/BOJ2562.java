package com.codigtest.array;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();

            if (a > max) {
                max = a;
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);

    }
}
