package Solving_Step_by_Step.Chap15.BOJ_2565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[][] wire = new int[N][2];

        for(int i = 0; i < wire.length; i++) {
            st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < dp.length; i++) {
            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(wire[i][1] > wire[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for(int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(N - max);
        br.close();
    }
}


// TODO : 더 공부하기
// 해당 문제의 규칙성
// 1. i번째 전봇대를 기준으로 이전 전봇대들을 탐색
// 2. i번째 A전봇대에 연결된 B전봇대는 j번째 전봇대에 연결된 B전봇대보다 값이 커야 한다.