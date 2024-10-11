package com.codigtest.fors;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= a; j++) {
                if (i <= j) {
                    str.append("*");
                } else {
                    str.append(" ");
                }
            }

            System.out.println(str);
        }
    }
}
