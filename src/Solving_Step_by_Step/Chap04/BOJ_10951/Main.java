package Solving_Step_by_Step.Chap04.BOJ_10951;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String a;

        while((a = br.readLine()) != null) {
            st = new StringTokenizer(a);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A+B + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}