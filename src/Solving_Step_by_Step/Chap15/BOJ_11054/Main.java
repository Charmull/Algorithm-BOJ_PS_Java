package Solving_Step_by_Step.Chap15.BOJ_11054;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// Bottom-Up 풀이
public class Main {
    static int N;
    static int[] seq;
    static int[] r_dp;
    static int[] l_dp;

    private static void LIS() {
        for(int i = 0; i < N; i++) {
            r_dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(seq[j] < seq[i] && r_dp[i] < r_dp[j] + 1) {
                    r_dp[i] = r_dp[j] + 1;
                }
            }
        }
    }

    private static void LDS() {
        for (int i = N - 1; i >= 0; i--) {
            l_dp[i] = 1;

            for (int j = N - 1; j > i; j--) {
                if (seq[j] < seq[i] && l_dp[i] < l_dp[j] + 1) {
                    l_dp[i] = l_dp[j] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        r_dp = new int[N];
        l_dp = new int[N];
        seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        LIS();
        LDS();

        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < r_dp[i] + l_dp[i]) {
                max = r_dp[i] + l_dp[i];
            }
        }

        System.out.println(max - 1);
        br.close();
    }
}


// 해당 문제의 규칙성
// 1. LIS
// 탐색하는 위치(i)에서 이전 위치들(0~i, 인덱스 j)을 돌며 j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1보다 작으면
// j번째 원소의 값에 1을 더한 값이 i번째 dp값이 되도록 한다.
// 2. LDS
// 1번 LIS와 같은 방식으로 구현하되, 맨 뒤에서부터 오름차순으로 구현한다.