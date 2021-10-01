package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 병합 정렬
// TODO : 병합 정렬 2가지 알고리즘 더 구현하고 비교해보기
// 시간복잡도 : O(nlogn)
// 공간복잡도 : O(n) (약 n / 2)
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
        temp = new int[len / 2];
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


// 병합 정렬 3가지 알고리즘 비교해보기
// OtherSolve06, OtherSolve06_02, OtherSolve06_03 모두 시간복잡도로 비교해보았을 때는 거의 차이가 없다고 보아도 무방하다.
// 공간복잡도로 비교해보면 차례로 n / 2, n, 2n 순으로 2배씩 차이가 있었다. 다만 Big-O로 표기하였을 때는 공간복잡도 또한 모두 n으로 동일하다.