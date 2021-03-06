package Solving_Step_by_Step.Chap09.BOJ_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for(int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(isPrime(temp)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
