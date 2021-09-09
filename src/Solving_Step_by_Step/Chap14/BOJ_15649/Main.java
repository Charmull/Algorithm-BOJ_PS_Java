package Solving_Step_by_Step.Chap14.BOJ_15649;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {                       // 재귀 깊이가 M과 같으면 탐색 중 담았떤 배열 출력
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;             // 해당 깊이를 index로 해 i+1 값 저장
                dfs(N, M, depth + 1);     // 다음 자식 노드 재귀 호출

                visit[i] = false;               // 재귀 호출 끝난 후, visit를 false로 변경
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);
        br.close();
    }
}