package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    private static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i; j > 0 && arr[j-1] > tmp; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(arr);

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
