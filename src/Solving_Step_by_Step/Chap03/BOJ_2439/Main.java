package Solving_Step_by_Step.Chap03.BOJ_2439;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j < N-1-i) {
                    bw.write(" ");
                }
                else {
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
