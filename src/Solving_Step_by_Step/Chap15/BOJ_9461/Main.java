package Solving_Step_by_Step.Chap15.BOJ_9461;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Bottom-Up 풀이
public class Main {
    static long[] seq = new long[101];

    private static void padovan() {
        seq[1] = 1;
        seq[2] = 1;
        seq[3] = 1;

        for (int i = 4; i < 101; i++) {
            seq[i] = seq[i - 2] + seq[i - 3];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        padovan();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(seq[Integer.parseInt(br.readLine())]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}

// 해당 문제의 규칙성
// 파도반 수열은 P(N) = P(N-2) + P(N-3) 을 만족한다.