package Solving_Step_by_Step.Chap08.BOJ_10250;

import java.io.*;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            // Main과 다르게 if문으로 검사하지않고, ceil도 쓰지않는 방법
            int resultX = (N-1)/H + 1;
            int resultY = (N-1)%H + 1;

            // String.format 사용하지않고, resultY(층수)에 100곱해주는 방법
            bw.write(Integer.toString(resultY*100 + resultX));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
