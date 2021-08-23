package Solving_Step_by_Step.Chap15.BOJ_1003;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 재귀(Top-Down)를 이용하는 풀이는 반복문(Bottom-Up)을 이용하는 풀이에 비해 함수 호출의 개수가 기하급수적으로 늘어나기 때문에 느리다.
// 대부분의 알고리즘은 규칙성이 있어 수식화가 가능하다. 그 규칙성을 찾아 반복문을 이용한 풀이법을 찾아야 한다.
// Bottom-Up 풀이
public class Main {
    static int zero;
    static int one;
    static int zero_plus_one;

    private static void fibonacci(int N) {
        zero = 1;
        one = 0;
        zero_plus_one = 1;

        for (int i = 0; i < N; i++) {
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero + one;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(zero).append(' ').append(one).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}


// 해당 피보나치 문제의 규칙성
// 1. N의 0 호출 횟수 = N-1의 1 호출 횟수
// 2. N의 1 호출 횟소 = N-1의 0 호출 횟수 + N-1의 1 호출 횟수