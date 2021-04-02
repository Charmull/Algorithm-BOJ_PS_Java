package Solving_Step_by_Step.Chap07.BOJ_5622;

import java.io.*;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int[] sumArr = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10};
        int sum = 0;

        for(int i = 0; i < input.length(); i++) {
            sum += sumArr[input.charAt(i) - 65];
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
