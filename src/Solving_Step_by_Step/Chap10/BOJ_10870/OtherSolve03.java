package Solving_Step_by_Step.Chap10.BOJ_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        for(int i = 0; i < n+1; i++) {
            if(i == 0) {
                arr[i] = 0;
            }
            else if(i == 1) {
                arr[i] = 1;
            }
            else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println(arr[n]);
        br.close();
    }
}
