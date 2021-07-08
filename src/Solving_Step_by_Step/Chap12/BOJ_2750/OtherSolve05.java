package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 퀵 정렬
// 시간복잡도 : O(n^2)
public class OtherSolve05 {
    private static void sort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2];

        do {
            while(arr[pl] < x) {
                pl++;
            }
            while(arr[pr] > x) {
                pr--;
            }

            if(pl <= pr) {
                int temp = arr[pl];
                arr[pl] = arr[pr];
                arr[pr] = temp;

                pl++;
                pr--;
            }
        } while(pl <= pr);

        if(left < pr) {
            sort(arr, left, pr);
        }
        if(pl < right) {
            sort(arr, pl, right);
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

        sort(arr, 0, n-1);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
