package Solving_Step_by_Step.Chap09.BOJ_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO : 시간복잡도 계산 ( O(N log(logN)) )
public class OtherSolve02 {
    public static boolean[] makePrime(int max) {
        boolean[] isPrime = new boolean[max + 1];
        isPrime[0] = true;
        isPrime[1] = true;

        for(int i = 2; i <= Math.sqrt(max); i++) {      // max의 제곱근까지만 반복 (범위 내의 수 모두, 제곱근의 값은 max의 제곱근의 값보다 작기때문)
            if(isPrime[i] == false) {
                for(int j = i*i; j < max + 1; j = j+i) {    // 정석대로면 j = i*2이지만, 이미 2의 배수가 첫 반복에서 걸러지기때문에 i 제곱으로 시작
                                                            // (2의 배수 말고도 k(단, 2 < k < i이고 k는 자연수)의 배수들 또한 이전 반복들에서 걸러짐)
                    isPrime[j] = true;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] primeArr = makePrime(1000);
        int count = 0;
        for(int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(primeArr[temp] == false) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}


// note : line 14의 'i < Math.sqrt(max);'에 대해,
//          만약 max가 120이라면 120의 제곱근(10.95...) 이하의 자연수 10까지만 반복하면 된다.
//          그러면 120의 약수 중 10보다 작은 수들과 그 수들의 배수가 걸러지므로, 자연스럽게 120의 10보다 큰 약수들 또한 걸러진다.
//          물론 120의 약수가 아닌 10보다 작은 수들과 그 배수들도 걸러진다.
//          120의 약수 : 1 2 3 4 5 6 8 10 / 12 15 20 24 30 40 60 120
//          +) Math.sqrt(max)보다 큰 소수의 경우(예를 들어 11), 범위 내(10이하)의 반복에서 고려하지않는 그 수의 배수(예를 들어 11*11)는 120보다 크다. 따라서 'i < Math.sqrt(max);'의 범위가 가장 적절하다.