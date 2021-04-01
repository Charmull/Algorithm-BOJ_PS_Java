package Solving_Step_by_Step.Chap07.BOJ_2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken(), B = st.nextToken();
        char[] AUSD = new char[3], BUSD = new char[3];

        for(int i = 0; i < A.length(); i++) {
            AUSD[i] = A.charAt((A.length()-1)-i);
            BUSD[i] = B.charAt((B.length()-1)-i);
        }
        int AbySG = Integer.parseInt(String.valueOf(AUSD));
        int BbySG = Integer.parseInt(String.valueOf(BUSD));
        bw.write(Integer.toString(Math.max(AbySG, BbySG)));

        br.close();
        bw.flush();
        bw.close();
    }
}
