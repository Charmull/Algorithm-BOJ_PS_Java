package Solving_Step_by_Step.Chap12.BOJ_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// TODO : 2750번 문제와 함께, 다양한 정렬 알고리즘 공부하기
public class Main {
//    private static void sort(int[] arr) {
//        for(int i = 1; i < arr.length; i++) {
//            int tmp = arr[i];
//            int j;
//            for(j = i; j > 0 && arr[j-1] > tmp; j--) {
//                arr[j] = arr[j-1];
//            }
//            arr[j] = tmp;
//        }
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}


// Java8 버전일 경우 (버전마다 조금씩 다름) :
// Arrays.sort()는 dual-pivot Quicksort 알고리즘 사용.
// 평균 시간복잡도가 O(nlogn)이지만 최악의 경우 O(n^2)임.
// 따라서 Collections.sort()를 사용하는 것이 바람직함.
// 참고 : https://st-lab.tistory.com/106