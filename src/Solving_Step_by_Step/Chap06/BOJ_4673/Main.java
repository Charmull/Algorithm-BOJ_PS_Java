package Solving_Step_by_Step.Chap06.BOJ_4673;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i <= 10000; i++) {
            boolean isNotSelfNum = false;

            for(int j = 1; j < i; j++) {
                if(i == (j + j%10 + (j/10)%10 + (j/100)%10 + (j/1000)%10 + (j/10000)%10)) {
                    isNotSelfNum = true;
                    break;
                }
            }

            if(!isNotSelfNum) {
                 bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
