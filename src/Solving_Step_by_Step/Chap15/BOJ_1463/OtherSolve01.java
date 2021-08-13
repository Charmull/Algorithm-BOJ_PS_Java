package Solving_Step_by_Step.Chap15.BOJ_1463;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OtherSolve01 {
    private static int recur(int N, int count) {
        if (N < 2) {
            return count;
        }
        
        return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(recur(N, 0));
        br.close();
    }
}
