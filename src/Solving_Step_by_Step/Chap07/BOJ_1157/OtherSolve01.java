package Solving_Step_by_Step.Chap07.BOJ_1157;

import java.io.*;
import java.util.HashMap;

// HashMap으로 푸는 방법
// TODO: HashMap 최대값 구하기 공부 ( https://escapefromcoding.tistory.com/167 )
public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < input.length(); i++) {
            int keyASC;
            if(input.charAt(i) >= 97) {
                keyASC = (input.charAt(i) - 97);
            }
            else {
                keyASC = (input.charAt(i) - 65);
            }

            String key = String.valueOf((char)(keyASC+65));
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key, 1);
            }
        }

        System.out.println(map);

        br.close();
        bw.flush();
        bw.close();
    }
}
