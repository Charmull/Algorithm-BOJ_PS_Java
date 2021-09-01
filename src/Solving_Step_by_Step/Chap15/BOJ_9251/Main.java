package Solving_Step_by_Step.Chap15.BOJ_9251;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bottom-Up 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int length_1 = str1.length;
        int length_2 = str2.length;

        int[][] dp = new int[length_1 + 1][length_2 + 1];

        for(int i = 1; i <= length_1; i++) {
            for(int j = 1; j <= length_2; j++) {
                if(str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[length_1][length_2]);
        br.close();
    }
}


// 해당 문제의 규칙성
// 1. str1[x] == str2[y]일 때, dp[x][y] = LCS(x-1, y-1) + 1
// 2. str1[x] != str2[y]일 때, dp[x][y] = max( LCS(x-1, y), LCS(x, y-1) )