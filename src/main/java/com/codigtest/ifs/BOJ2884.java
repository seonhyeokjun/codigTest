package com.codigtest.ifs;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute -= 45;

        if(minute < 0){
            hour--;

            if (hour < 0) {
                hour = 24 - Math.abs(hour);
            }

            System.out.println(hour + " " + (60 - Math.abs(minute)));
        } else {
            System.out.println(hour + " " + minute);
        }
    }
}
