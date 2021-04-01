package Solving_Step_by_Step.Chap07.BOJ_2908;

import java.io.*;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        A = (A%10)*100 + (A%100/10)*10 + (A/100);
        B = (B%10)*100 + (B%100/10)*10 + (B/100);

        bw.write(Integer.toString(Math.max(A, B)));

        br.close();
        bw.flush();
        bw.close();
    }
}
