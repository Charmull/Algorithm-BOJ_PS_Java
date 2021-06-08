package Solving_Step_by_Step.Chap09.BOJ_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(x[0]^x[1]^x[2]).append(' ').append(y[0]^y[1]^y[2]);
        System.out.println(sb);
        br.close();
    }
}
