package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 사이트에서 제출 번호 29857124와 비교하기
// TODO : 여러가지 sort 공부하기 (자료구조)
public class Main {
    private static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    private static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for(int j = i; j > 0 && arr[j-1] > tmp; j--) {
                swap(arr, j, j-1);
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

        sort(arr);

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
