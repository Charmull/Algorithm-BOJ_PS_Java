package Solving_Step_by_Step.Chap15.BOJ_2156;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        if (N > 1) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));

        }

        System.out.println(dp[N]);
        br.close();
    }
}

// TODO : 더 공부하기
// 해당 문제의 규칙성
// 'recur(N-2)'와 'recur(N-3) + arr[N-1]' 중 더 큰 값을 구해, recur(N-1)과 비교한다.