package Solving_Step_by_Step.Chap07.BOJ_1316;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            HashSet<String> temp = new HashSet<String>();

            int j = 1;
            temp.add(input.substring(0, 1));
            for(; j < input.length(); j++) {
                if(input.charAt(j-1) == input.charAt(j)) {
                    temp.add(input.substring(j, j+1));
                }
                else {
                    if(temp.contains(input.substring(j, j+1))) {
                        break;
                    }
                    else {
                        temp.add(input.substring(j, j+1));
                    }
                }
            }

            if(j == input.length()) {
                count++;
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
