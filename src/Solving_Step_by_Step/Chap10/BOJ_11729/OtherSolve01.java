package Solving_Step_by_Step.Chap10.BOJ_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    static StringBuilder sb = new StringBuilder();

    private static void hanoi(int n, int start, int mid, int to) {
        if(n == 1) {
            sb.append(start).append(' ').append(to).append('\n');
            return;
        }

        hanoi(n - 1, start, to, mid);   // 맨 위에 있는 탑 제외, 나머지는 중간 기둥(mid)으로 옮기기

        sb.append(start).append(' ').append(to).append('\n');   // 맨 위의 탑을 목적지(to)로 옮기기

        hanoi(n - 1, mid, start, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) Math.pow(2, N) - 1).append('\n');
        hanoi(N, 1, 2, 3);
        System.out.println(sb);
        br.close();
    }
}
