package com.codigtest.fors;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(b + c));
            bw.newLine();
        }

        bw.flush(); // 루프 밖에서 한 번만 flush 호출
        bw.close();
        br.close(); // BufferedReader도 닫아줍니다.
    }
}
