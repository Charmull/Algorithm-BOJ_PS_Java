package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 도수 정렬
public class OtherSolve08 {
    private static void sort(int[] arr, int len, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[len];

        for(int i = 0; i < len; i++) {
            f[arr[i]]++;
        }
        for(int i = 1; i <= max; i++) {
            f[i] += f[i-1];
        }
        for(int i = len-1; i >= 0; i--) {
            b[--f[arr[i]]] = arr[i];
        }
        for(int i = 0; i < len; i++) {
            arr[i] = b[i];
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

        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        sort(arr, n, max);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
