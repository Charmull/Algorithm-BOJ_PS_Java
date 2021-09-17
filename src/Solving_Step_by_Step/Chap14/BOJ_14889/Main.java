package Solving_Step_by_Step.Chap14.BOJ_14889;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    private static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {             // i, j번째 모두 visit ture이면 시작팀이므로 플러스 점수
                    team_start += map[i][j];
                    team_start += map[j][i];
                }
                else if (visit[i] == false && visit[j] == false) {      // i, j번째 모두 visit false이면 링크팀으로 플러스 점수
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }

        int val = Math.abs(team_start - team_link);         // 점수 차이 계산

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }
        Min = Math.min(val, Min);
    }

    private static void comb(int idx, int count) {
        if(count == N / 2) {        // 조합 완성 시
            diff();
            return;
        }

        for(int i = idx; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                comb(i + 1, count + 1);     // 다음 index로 재귀 호출
                visit[i] = false;                     // 재귀 끝나면 방문하지 않음으로 변경
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        comb(0, 0);
        System.out.println(Min);
        br.close();
    }
}
