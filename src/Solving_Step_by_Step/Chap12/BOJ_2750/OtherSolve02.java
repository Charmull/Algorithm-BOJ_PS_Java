package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단순선택정렬
// 시간복잡도 : O(n^2)
public class OtherSolve02 {
    private static void sort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            int minIdx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            // Exchange arr[i] for arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
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
