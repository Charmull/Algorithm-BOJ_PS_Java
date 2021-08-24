package Solving_Step_by_Step.Chap15.BOJ_1904;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bottom-Up 풀이
public class Main {
    private static int tile(int a) {
        if (a == 1) {
            return 1;
        }

        if (a == 2) {
            return 2;
        }

        int val1 = 1;
        int val2 = 2;
        int sum = 0;

        for (int i = 2; i < a; i++) {
            sum = (val2 + val1) % 15746;
            val1 = val2;
            val2 = sum;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(tile(n));
        br.close();
    }
}

// 해당 문제의 규칙성
// 수열의 개수는 피보나치 수의 수열처럼 증가한다. 수열의 개수를 Tile(n)이라 할 때,
// Tile(N) = Tile(N-1) + Tile(N-2) 을 만족한다. (점화식)
