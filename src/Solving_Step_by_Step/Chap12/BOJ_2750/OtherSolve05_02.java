package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 퀵 정렬
// 시간복잡도 : O(n^2)  (평균 시간복잡도는 nlogn)
public class OtherSolve05_02 {
    private static int sortHelper(int[] arr, int start, int end) {
        int pivotItem = arr[start];
        int j = start;

        for(int i = start + 1; i <= end; i++) {
            if(pivotItem > arr[i]) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = pivotItem;
        arr[start] = temp;

        return j;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = sortHelper(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
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

        quickSort(arr, 0, n-1);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
