package Solving_Step_by_Step.Chap03.BOJ_2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            bw.write(i+1 + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
