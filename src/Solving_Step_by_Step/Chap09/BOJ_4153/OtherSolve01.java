package Solving_Step_by_Step.Chap09.BOJ_4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] lenArr = new int[3];

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lenArr[0] = Integer.parseInt(st.nextToken());
            lenArr[1] = Integer.parseInt(st.nextToken());
            lenArr[2] = Integer.parseInt(st.nextToken());

            if(lenArr[0] == 0) {
                break;
            }

            Arrays.sort(lenArr);
            if(Math.pow(lenArr[0], 2) + Math.pow(lenArr[1], 2) == Math.pow(lenArr[2], 2)) {
                sb.append("right").append("\n");
            }
            else {
                sb.append("wrong").append("\n");
            }
        }

        System.out.print(sb);

        br.close();
    }
}

// Main : memory 14164KB, 시간 120ms
// OtherSolve01 : memory 14052KB, 시간 124ms