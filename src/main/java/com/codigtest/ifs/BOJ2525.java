package com.codigtest.ifs;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cook = sc.nextInt();

        minute += cook;

        if (minute >= 60) {
            hour += minute / 60;

            if (hour >= 24) {
                hour %= 24;
            }

            minute %= 60;
        }

        System.out.println(hour + " " + minute);
    }
}
