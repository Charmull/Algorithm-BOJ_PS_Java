package Solving_Step_by_Step.Chap15.BOJ_2579;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// TODO : 더 공부해보기
// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[N + 1];
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        DP[1] = arr[1];

        if (N >= 2) {
            DP[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= N; i++) {
            DP[i] = Math.max(DP[i - 2] , DP[i - 3] + arr[i - 1]) + arr[i];
        }

        System.out.println(DP[N]);
        br.close();
    }
}

// 해당 문제의 규칙성
// DP[n]은 n에 대한 메모이제이션 값이고, arr[n]은 n에 대한 계단의 값
// DP[i] = max(DP[i-2], DP[i-3] + arr[i-1]) + arr[i]