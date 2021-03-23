package Solving_Step_by_Step.Chap05.BOJ_8958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String st = br.readLine();
            int count = 0;
            int sum = 0;

            for(int j = 0; j < st.length(); j++) {
                if(st.charAt(j) == 'O') {
                    sum += (++count);
                }
                else {
                    count = 0;
                }
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
