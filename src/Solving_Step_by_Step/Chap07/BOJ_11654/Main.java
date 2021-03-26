package Solving_Step_by_Step.Chap07.BOJ_11654;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char ch = br.readLine().charAt(0);
        int num = ch;
        bw.write(Integer.toString(num));

        br.close();
        bw.flush();
        bw.close();
    }
}
