package Solving_Step_by_Step.Chap05.BOJ_3052;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size = 0;

        for(int i = 0; i < 10; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(arr.contains(temp % 42)) {
                continue;
            }
            else {
                arr.add(temp % 42);
                size++;
            }
        }
        bw.write(Integer.toString(size));

        br.close();
        bw.flush();
        bw.close();
    }
}
