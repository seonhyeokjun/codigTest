package com.codigtest.operations;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = String.valueOf(b);
        String[] arr = s.split("");

        int c = a * Integer.parseInt(arr[2]);
        System.out.println(c);
        int d = a * Integer.parseInt(arr[1]);
        System.out.println(d);
        int e = a * Integer.parseInt(arr[0]);
        System.out.println(e);
        int f = c + (d * 10) + (e * 100);
        System.out.println(f);
    }
}
