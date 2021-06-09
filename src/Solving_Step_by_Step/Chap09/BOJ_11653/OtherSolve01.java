package Solving_Step_by_Step.Chap09.BOJ_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 14688KB, 시간 : 148ms
public class OtherSolve01 {
    public static void returnPrime(int num, StringBuilder sb) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            while(num % i == 0) {
                sb.append(i).append('\n');
                num /= i;
            }
        }

        if(num != 1) {
            sb.append(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        returnPrime(N, sb);
        System.out.println(sb);

        br.close();
    }
}

// line 10 에서 반복을 'i <= Math.sqrt(num);'일 때까지만 하면서, 1 또는 소수인 나머지가 발생할 수 있다.
// 이 나머지가 소수라면, 그 수는 num의 제곱근보다 크다는 의미이고, 그 소수로 나눠진 수(num을 나눈 몫)는 num의 제곱근보다 항상 작다.
// num의 제곱근보다 작은 수는 앞의 for문에서 걸러지게 되기때문에, 해당 소수는 그대로 출력해도 되는 유일한 소수이다.