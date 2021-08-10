package Solving_Step_by_Step.Chap15.BOJ_9461;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OtherSolve01 {
    private static Long[] seq = new Long[101];

    private static long padovan(int N) {
        if(seq[N] == null) {
            seq[N] = padovan(N - 2) + padovan(N - 3);
        }
        return seq[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
        }

        System.out.println(sb);
    }
}
