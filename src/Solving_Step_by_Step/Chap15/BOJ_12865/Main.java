package Solving_Step_by_Step.Chap15.BOJ_12865;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if(W[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }

        System.out.println(dp[N][K]);
        br.close();
    }
}


// 해당 문제의 규칙성
// 1. i = 0, k = 0일 때, 0
// 2. W[i] > k일 때, dp[i][k] = knapsack(i-1, k)
// 3. 0 < i , W[i] <= k일 때, dp[i][k] = max( knapsack(i-1, k), knapsack(i-1, k-W[i]) + V[i] )