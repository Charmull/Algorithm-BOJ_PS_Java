package Solving_Step_by_Step.Chap08.BOJ_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        br.close();

        int line = 1;
        while(N-1 > 0) {
            N -= line*6;
            line++;
        }

        System.out.println(line);
    }
}
