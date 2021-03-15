package Sorting_Algorithm;

import java.util.Scanner;

// 기본 정렬 알고리즘 중 Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = {A, B, C};

        int maxIdx;
        int temp;
        for(int i = arr.length - 1; i > 0; i--) {
            maxIdx = i;
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(String.format("%d %d %d", arr[0], arr[1], arr[2]));
    }
}