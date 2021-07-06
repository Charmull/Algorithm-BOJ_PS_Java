package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 힙 정렬
public class OtherSolve07 {
    private static void heap(int[] arr, int left, int right) {
        int temp = arr[left];
        int child;
        int parent;

        for(parent = left; parent < (right+1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && arr[cr] > arr[cl]) ? cr : cl;
            if(temp > arr[child]) {
                break;
            }
            arr[parent] = arr[child];
        }

        arr[parent] = temp;
    }
    private static void sort(int[] arr, int len) {
        for(int i = (len-1) / 2; i >= 0; i--) {
            heap(arr, i, len-1);
        }

        for(int i = len-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, 0, i-1);
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
