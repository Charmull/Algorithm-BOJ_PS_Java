package Solving_Step_by_Step.Chap10.BOJ_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO : 다시 스스로 풀어보기, 다른 방법 도전해보기
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    private static void hanoi(int n, int start, int end) {
        if(n > 1) {
            hanoi(n-1, start, 6-start-end);
        }

        sb.append(start).append(' ').append(end).append('\n');
        count++;

        if(n > 1) {
            hanoi(n-1, 6-start-end, end);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 3);
        System.out.println(count);
        System.out.println(sb);
        br.close();
    }
}
