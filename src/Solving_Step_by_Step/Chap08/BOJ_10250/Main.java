package Solving_Step_by_Step.Chap08.BOJ_10250;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
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

            int resultX = (int)Math.ceil((double)N/H);
            int resultY = N%H;
            if(resultY == 0) {
                resultY = H;
            }

            bw.write(String.format("%d%02d\n", resultY, resultX));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
