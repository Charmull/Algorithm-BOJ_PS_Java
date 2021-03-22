package Solving_Step_by_Step.Chap05.BOJ_3052;

import java.io.*;
import java.util.HashSet;

public class UseHashSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        bw.write(Integer.toString(h.size()));

        br.close();
        bw.flush();
        bw.close();
    }
}
