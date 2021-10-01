package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 병합 정렬
// 시간복잡도 : O(nlogn)
// 공간복잡도 : O(n) (약 2n)
public class OtherSolve06_03 {
    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int mid, int len) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < mid && j < len - mid) {
            if(leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }

        if(i == mid) {
            while(j < len - mid) {
                arr[k++] = rightArr[j++];
            }
        }
        else {
            while(i < mid) {
                arr[k++] = leftArr[i++];
            }
        }
    }
    private static void mergeSort(int[] arr, int len) {
        if(len != 1) {
            int mid = len / 2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[len - mid];

            for(int i = 0; i < mid; i++) {
                leftArr[i] = arr[i];
            }
            for(int i = 0; i < len - mid; i++) {
                rightArr[i] = arr[mid + i];
            }

            mergeSort(leftArr, mid);
            mergeSort(rightArr, len - mid);
            merge(arr, leftArr, rightArr, mid, len);
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

        mergeSort(arr, n);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
