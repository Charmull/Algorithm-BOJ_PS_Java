package Solving_Step_by_Step.Chap07.BOJ_2941;

import java.io.*;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] cro = {"c=", "c-", "dz=", "d-", "li", "nj", "s=", "z="};

        for(int i = 0; i < cro.length; i++) {
            input = input.replace(cro[i], "!");
        }
        bw.write(Integer.toString(input.length()));

        br.close();
        bw.flush();
        bw.close();
    }
}
