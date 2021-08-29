package Solving_Step_by_Step.Chap15.BOJ_10844;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bottom-Up 풀이
public class Main {
    final static long mod = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][10];

        for(int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    dp[i][0] = dp[i - 1][1] % mod;
                }
                else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % mod;
                }
                else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long result = 0;

        for(int i = 0; i < 10; i++) {
            result += dp[N][i];
        }

        System.out.println(result % mod);
        br.close();
    }
}

// 해당 문제의 유의사항
// 1. N번째 자릿수의 값이 0인 경우 : 다음 자릿수의 값은 1밖에 올 수 없다.
// 2. N번째 자릿수의 값이 9인 경우 : 다음 자릿수의 값은 8밖에 올 수 없다.