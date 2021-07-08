package Solving_Step_by_Step.Chap12.BOJ_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 도수 정렬
// 단일 for문만을 사용, 재귀 호출과 이중 for문이 없어 아주 효율적인 알고리즘이다.
// 하지만 도수분포표가 필요하기 때문에, 데이터의 최솟값과 최댓값을 미리 알고 있는 경우에만 사용할 수 있다.
public class OtherSolve08 {
    private static void sort(int[] arr, int len, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[len];

        for(int i = 0; i < len; i++) {
            f[arr[i]]++;
        }
        for(int i = 1; i <= max; i++) {
            f[i] += f[i-1];
        }
        for(int i = len-1; i >= 0; i--) {
            b[--f[arr[i]]] = arr[i];
        }
        for(int i = 0; i < len; i++) {
            arr[i] = b[i];
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

        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        sort(arr, n, max);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
