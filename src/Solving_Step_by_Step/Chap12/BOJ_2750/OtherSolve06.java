package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 병합 정렬
// 시간복잡도 : O(nlogn)
public class OtherSolve06 {
    private static int[] temp;

    private static void sortHelper(int[] a, int left, int right) {
        if(left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            sortHelper(a, left, center);
            sortHelper(a, center+1, right);

            for(i = left; i <= center; i++) {
                temp[p++] = a[i];
            }

            while(i <= right && j < p) {
                a[k++] = (temp[j] <= a[i]) ? temp[j++] : a[i++];
            }

            while(j < p) {
                a[k++] = temp[j++];
            }
        }
    }

    private static void sort(int[] arr, int len) {
        temp = new int[len];
        sortHelper(arr, 0, len-1);
        temp = null;
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
