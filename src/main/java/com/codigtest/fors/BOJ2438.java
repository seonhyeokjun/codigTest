package com.codigtest.fors;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                str.append("*");
            }

            System.out.println(str);
        }
    }
}
