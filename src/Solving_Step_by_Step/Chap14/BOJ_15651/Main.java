package Solving_Step_by_Step.Chap14.BOJ_15651;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    private static void dfs(int depth) {
        if (depth == M) {                       // 재귀 깊이가 M과 같으면 탐색 중 담았떤 배열 출력
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);             // 깊이를 1씩 증가시키면서 재귀 호출
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(0);

        System.out.println(sb);
        br.close();
    }
}
