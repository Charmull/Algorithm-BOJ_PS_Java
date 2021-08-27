package Solving_Step_by_Step.Chap15.BOJ_1463;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// TODO : 더 공부해보기
public class Main {
    static Integer[] dp;

    private static int recur(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }
            else {
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 0;

        System.out.print(recur(N));
        br.close();
    }
}

// 주의 사항 : 무조건 큰 수로 나누는 것이 최솟값이 아님
// 따라서 6으로 나누어지는 경우 - 3으로 나누는 경우, 2로 나누는 경우, 1을 빼는 경우 중 최솟값
//       3으로만 나누어지는 경우 - 3으로 나누는 경우, 1을 빼는 경우 중 최솟값
//       2로만 나누어지는 경우 - 2로 나누는 경우, 1을 빼는 경우 중 최솟값
//       그 외의 경우 - 1을 빼는 경우 중 최솟값