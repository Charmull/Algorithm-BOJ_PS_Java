package Solving_Step_by_Step.Chap08.BOJ_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        br.close();

        int k = 1;      // 왼쪽을 기준으로 몇번째 대각선인지를 나타내자. (k가 1이면 왼쪽에서 첫번째 대각선)
        while(X > k) {
            X -= (k++);
        }

        int a = k, b = 1;   // 분수를 a/b 혹은 b/a로 가정하자. a와 b 중 무엇이 분자, 무엇이 분모가 될지는 뒤에서 고려하자.
        for(int i = 1; i < X; i++) {
            a--;
            b++;
        }

        int denominator;
        int numerator;
        if(k % 2 == 1) {    // k가 홀수면 k/1부터 (대각선이 아래부터 위로 올라감)
            denominator = b;
            numerator = a;
        }
        else {      // k가 짝수면 1/k부터 (대각선이 위에서 아래로 내려감)
            denominator = a;
            numerator = b;
        }

        System.out.printf("%d/%d", numerator, denominator);
    }
}
