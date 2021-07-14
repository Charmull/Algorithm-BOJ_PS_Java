package Solving_Step_by_Step.Chap11.BOJ_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] weightArr = new int[N];
        int[] heightArr = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weightArr[i] = Integer.parseInt(st.nextToken());
            heightArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[N];
        for(int i = 0; i < N; i++) {
            int high = 0;
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }
                if(weightArr[i] < weightArr[j] && heightArr[i] < heightArr[j]) {
                    high++;
                }
            }
            rank[i] = ++high;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(rank[i]).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}

// 큰 차이는 없지만, 2차원 배열을 사용할 경우 메모리가 조금 더 요구됨
// 결과
// Main - 메모리 14148KB, 시간 124ms
// OtherSolve01 - 메모리 14184KB, 시간 124ms