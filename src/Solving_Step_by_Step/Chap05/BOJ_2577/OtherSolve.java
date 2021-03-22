package Solving_Step_by_Step.Chap05.BOJ_2577;

import java.io.*;

public class OtherSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = Integer.toString(A*B*C);
        int[] arr = new int[10];

        for(int i = 0; i < result.length(); i++) {
            int val = Integer.parseInt(result.substring(i, i+1));
            arr[val]++;
        }

        for(int val : arr) {
            bw.write(val + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
