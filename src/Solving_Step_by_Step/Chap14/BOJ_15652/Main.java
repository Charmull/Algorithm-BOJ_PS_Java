package Solving_Step_by_Step.Chap14.BOJ_15652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    private static void dfs(int at, int depth) {
        if (depth == M) {                           // 재귀 깊이가 M과 같으면 탐색 중 담았떤 배열 출력
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = at; i <= N; i++) {             // at부터 탐색
            arr[depth] = i;                         // 현재 깊이를 index로 해 i 값 저장
            dfs(i, depth + 1);                // 비내림차순으로 중복이 허용되기때문에 i를 at으로 넘겨 재귀 호출
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);

        System.out.println(sb);
        br.close();
    }
}
