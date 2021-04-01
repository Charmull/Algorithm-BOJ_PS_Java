package Solving_Step_by_Step.Chap07.BOJ_2908;

import java.io.*;
import java.util.StringTokenizer;

// StringBuilder의 reverse 메소드 쓰기
public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        bw.write(Integer.toString(Math.max(A, B)));

        br.close();
        bw.flush();
        bw.close();
    }
}
