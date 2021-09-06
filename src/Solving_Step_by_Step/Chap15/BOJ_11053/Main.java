package Solving_Step_by_Step.Chap15.BOJ_11053;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;

        for(int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }

        System.out.println(max);
        br.close();
    }
}


// 해당 문제의 규칙성
// 탐색하는 위치에서 이전 위치들을 돌며 해당 값보다 작을 경우, 그 위치에 대해 다시 탐색한다