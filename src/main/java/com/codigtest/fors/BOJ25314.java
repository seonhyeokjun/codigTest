package com.codigtest.fors;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        StringBuilder str = new StringBuilder("int");

        for (int i = 0; i < a / 4; i++) {
            str.insert(0, "long ");
        }

        System.out.println(str);
    }
}
