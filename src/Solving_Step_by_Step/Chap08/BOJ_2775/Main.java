package Solving_Step_by_Step.Chap08.BOJ_2775;

import java.io.*;

public class Main {
    public static int people(int k, int n) {
        int result = 0;
        if(n == 1) {
            return 1;
        }
        else {
            if(k == 0) {
                return n;
            }
            else {
                for(int i = 1; i <= n; i++) {
                    result += people(k-1, i);
                }
                return result;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            if(k == 0) {
                result = n;
            }
            else {
                result = people(k, n);
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
