package Solving_Step_by_Step.Chap08.BOJ_2775;

import java.io.*;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int arr[][] = new int[15][14];

        for(int i = 0; i < 14; i++) {
            arr[0][i] = i+1;
            arr[i][0] = 1;
        }
        arr[14][0] = 1;

        for(int i = 1; i < 15; i++) {
            for(int j = 1; j < 14; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[k][n-1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
