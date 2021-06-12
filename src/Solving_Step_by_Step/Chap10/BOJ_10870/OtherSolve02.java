package Solving_Step_by_Step.Chap10.BOJ_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OtherSolve02 {
    static int[] arr;

    private static int fibonacci(int n) {
        if(arr[n] == -1) {      // 아직 채우지 않은(계산되지 않은) arr의 요소일 경우
            arr[n] = fibonacci(n-1) + fibonacci(n-2);
        }
        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        Arrays.fill(arr, -1);   // 기본적으로 arr의 모든 요소 값이 0으로 초기화되었을 때,
                                    // arr[0]의 경우 계산될 값이 0이므로 해당 요소값이 계산된 값인지 구분되지 않는다. (line 12에서 구분 필요!)
                                    // 따라서 배열을 모두 -1로 채워주자.
        if(n < 2) {
            System.out.println(n);
        }
        else {
            arr[0] = 0;
            arr[1] = 1;
            System.out.println(fibonacci(n));
        }

        br.close();
    }
}
