package Solving_Step_by_Step.Chap03.BOJ_11021;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(String.format("Case #%d: %d\n", i+1, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
