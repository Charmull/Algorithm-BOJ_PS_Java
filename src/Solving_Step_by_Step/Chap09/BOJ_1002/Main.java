package Solving_Step_by_Step.Chap09.BOJ_1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int turret(int x1 , int y1, int r1, int x2, int y2, int r2) {
        int distancePow = (int)(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        else if(distancePow > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        else if(distancePow < Math.pow(Math.abs(r2 - r1), 2)) {
            return 0;
        }
        else if(distancePow == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        else if(distancePow == Math.pow(Math.abs(r2 - r1), 2)) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(turret(x1, y1, r1, x2, y2, r2)).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
