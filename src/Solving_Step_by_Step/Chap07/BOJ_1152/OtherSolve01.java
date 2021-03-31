package Solving_Step_by_Step.Chap07.BOJ_1152;

import java.io.*;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(Integer.toString(st.countTokens()));

        br.close();
        bw.flush();
        bw.close();
    }
}
