package Solving_Step_by_Step.Chap15.BOJ_2156;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OtherSolve01 {
    static Integer[] dp;
    static int[] arr;

    private static int recur(int N) {
        if(dp[N] == null) {
            dp[N] = Math.max(Math.max(recur(N - 2), recur(N - 3) + arr[N - 1]) + arr[N], recur(N - 1));
        }

        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        dp = new Integer[N + 1];

        for(int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1];

        if(N > 1) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(recur(N));
        br.close();
    }
}
