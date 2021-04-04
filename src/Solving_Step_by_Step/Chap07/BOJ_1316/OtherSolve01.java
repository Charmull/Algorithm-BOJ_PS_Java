package Solving_Step_by_Step.Chap07.BOJ_1316;

import java.io.*;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = N;

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            for(int j = 1; j < input.length(); j++) {
                if(input.indexOf(input.charAt(j-1)) > input.indexOf(input.charAt(j))) {
                    count--;
                    break;
                }
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
