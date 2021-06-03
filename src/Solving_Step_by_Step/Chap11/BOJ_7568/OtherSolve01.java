package Solving_Step_by_Step.Chap11.BOJ_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO : 메모리, 시간 비교분석
public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dataList = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dataList[i][0] = Integer.parseInt(st.nextToken());
            dataList[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int high = 0;
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }
                if(dataList[i][0] < dataList[j][0] && dataList[i][1] < dataList[j][1]) {
                    high++;
                }
            }
            sb.append(++high).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
