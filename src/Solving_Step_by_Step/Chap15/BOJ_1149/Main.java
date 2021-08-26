package Solving_Step_by_Step.Chap15.BOJ_1149;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// Bottom-Up 풀이
public class Main {
    static int Red = 0;
    static int Green = 1;
    static int Blue = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] Cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Cost[i][Red] = Integer.parseInt(st.nextToken());
            Cost[i][Green] = Integer.parseInt(st.nextToken());
            Cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            Cost[i][Red] += Math.min(Cost[i - 1][Green], Cost[i - 1][Blue]);
            Cost[i][Green] += Math.min(Cost[i - 1][Red], Cost[i - 1][Blue]);
            Cost[i][Blue] += Math.min(Cost[i - 1][Red], Cost[i - 1][Green]);
        }

        System.out.println(Math.min(Math.min(Cost[N - 1][Red], Cost[N - 1][Green]), Cost[N - 1][Blue]));
        br.close();
    }
}

// 해당 문제의 규칙성
// 집을 칠하는 비용을 Cost라 할 때,
// Red : Cost[N][0] = min(Cost[N-1][1], Cost[N-1][2]) + Cost[N][0]
// Green : Cost[N][1] = min(Cost[N-1][0], Cost[N-1][2]) + Cost[N][1]
// Blue : Cost[N][2] = min(Cost[N-1][0], Cost[N-1][1]) + Cost[N][2]