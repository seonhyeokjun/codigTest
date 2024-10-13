package com.codigtest.array;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int[] out = new int[2];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        Collections.sort(list);

        int j = 0;
        for (int i = 1; i <= 30; i++) {
            if (!list.contains(i)) {
                out[j] = i;
                j++;
            }
        }

        for (int i : out) {
            System.out.println(i);
        }
    }
}
