package Solving_Step_by_Step.Chap08.BOJ_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        br.close();

        int k = 1;
        while(X > k) {
            X -= (k++);
        }

        if(k % 2 == 1) {    // k가 홀수면 k/1부터 (대각선이 아래부터 위로 올라감)
            System.out.printf("%d/%d", (k-X+1), X);
        }
        else {      // k가 짝수면 1/k부터 (대각선이 위에서 아래로 내려감)
            System.out.printf("%d/%d", X, (k-X+1));
        }
    }
}
