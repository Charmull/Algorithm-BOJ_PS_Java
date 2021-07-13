package Solving_Step_by_Step.Chap11.BOJ_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO : 백준 제출한 3가지 방법 비교분석 해보기
public class Main {
    private static int decompositionSum(int n) {
        int sum = n;
        while(n != 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 1;
        for( ; i < N; i++) {
            int temp = decompositionSum(i);
            if(temp == N) {
                System.out.println(i);
                break;
            }
        }

        if(i == N) {
            System.out.println(0);
        }

        br.close();
    }
}



// Main과 OtherSolve01의 차이점 정리
// N(분해합) = K(생성자) + k1 + k2 + k3   (단, k1, k2, k3는 K의 각 자리수. 이 문제의 경우 k6정도까지 나올 수 있음) 인데,
// 가장 작은 K를 구하기 위해서는 (k1 + k2 + k3)의 합이 될 수 있는 한으로 가장 커야 한다.
// 각 자리수의 최대값은 9이기 때문에, K(N)의 자리수의 개수에 9를 곱하고, 그 값을 N에 빼준 값부터 반복문을 돌린다.
// 즉, int i = N - N_len*9; 으로 i를 설정한 후 for문을 돌리면, 반복을 훨씬 줄일 수 있다.

// 결과
// Main - 메모리 14156KB, 시간 144ms
// OtherSolve01 - 메모리 14144KB, 시간 120ms