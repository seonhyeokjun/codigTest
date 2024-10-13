package com.codigtest.array;

import java.util.*;
import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int c = sc.nextInt();

            if (c < b) {
                list.add(c);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
