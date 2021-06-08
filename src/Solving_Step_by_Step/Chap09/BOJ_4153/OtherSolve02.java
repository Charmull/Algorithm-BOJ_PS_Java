package Solving_Step_by_Step.Chap09.BOJ_4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if(x == 0) {
                break;
            }

            if(Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
                sb.append("right").append('\n');
            }
            else if(Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2)) {
                sb.append("right").append('\n');
            }
            else if(Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2)) {
                sb.append("right").append('\n');
            }
            else {
                sb.append("wrong").append('\n');
            }
        }

        System.out.println(sb);
        br.close();
    }
}
