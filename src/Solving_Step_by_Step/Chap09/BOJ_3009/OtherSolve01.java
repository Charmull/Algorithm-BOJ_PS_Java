package Solving_Step_by_Step.Chap09.BOJ_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OtherSolve01 {
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

        if(x[0] == x[1]) {
            sb.append(x[2]).append(' ');
        }
        else if(x[0] == x[2]) {
            sb.append(x[1]).append(' ');
        }
        else {
            sb.append(x[0]).append((' '));
        }

        if(y[0] == y[1]) {
            sb.append(y[2]).append(' ');
        }
        else if(y[0] == y[2]) {
            sb.append(y[1]).append(' ');
        }
        else {
            sb.append(y[0]).append((' '));
        }

        System.out.println(sb);
        br.close();
    }
}
