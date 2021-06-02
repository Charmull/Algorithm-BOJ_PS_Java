package Solving_Step_by_Step.Chap11.BOJ_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
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
        String N_str = br.readLine();
        int N_len = N_str.length();
        int N = Integer.parseInt(N_str);

//        int i;
//        if(N - N_len*9 <= 0) {
//            i = 1;
//        }
//        else {
//            i = N - N_len*9;
//        }
        int i = N - N_len*9;
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
