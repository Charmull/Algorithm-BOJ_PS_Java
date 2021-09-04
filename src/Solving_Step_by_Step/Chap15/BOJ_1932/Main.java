package Solving_Step_by_Step.Chap15.BOJ_1932;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static Integer[][] dp;
    static int N;

    private static int find(int depth, int idx) {
        if(depth == N - 1) return dp[depth][idx];

        if (dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }

        return dp[depth][idx];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new Integer[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(find(0, 0));
        br.close();
    }
}


// 해당 문제의 규칙성
// 1. 맨 밑의 행에 도달하면 해당 인덱스 반환
// 2. 아직 탐색하지 않은 위치일 경우 다음 행의 양쪽 열 중 최댓값을 구하여 현재 인덱스의 값과 더해 저장