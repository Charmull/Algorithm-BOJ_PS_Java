package Solving_Step_by_Step.Chap05.BOJ_4344;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int[] score = new int[num];
            int avg = 0;

            for(int j = 0; j < num; j++) {
                int temp = Integer.parseInt(st.nextToken());
                score[j] = temp;
                avg += temp;
            }

            avg /= num;
            double count = 0;
            for(int j = 0; j < num; j++) {
                if(score[j] > avg) {
                    count++;
                }
            }

            bw.write(String.format("%.3f%%\n", count/num*100));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
