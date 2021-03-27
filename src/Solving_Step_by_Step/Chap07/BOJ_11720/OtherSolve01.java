package Solving_Step_by_Step.Chap07.BOJ_11720;

import java.io.*;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] arr = input.split("");
        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum+= Integer.parseInt(arr[i]);
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
