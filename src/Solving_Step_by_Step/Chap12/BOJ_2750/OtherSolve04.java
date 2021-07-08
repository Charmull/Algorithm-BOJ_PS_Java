package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 셸 정렬
// 시간복잡도 : O(nlog(n^2))
public class OtherSolve04 {
    private static void sort(int[] arr, int len) {
        for(int h = len/2; h > 0; h /= 2) {
            for(int i = h; i < len; i++) {
                int j;
                int temp = arr[i];
                for(j = i-h; j >= 0 && arr[j] > temp; j -= h) {
                    arr[j + h] = arr[j];
                }
                arr[j + h] = temp;
            }
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

        sort(arr, n);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
