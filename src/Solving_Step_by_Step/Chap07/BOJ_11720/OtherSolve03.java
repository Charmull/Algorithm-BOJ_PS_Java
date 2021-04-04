package Solving_Step_by_Step.Chap07.BOJ_11720;

import java.io.*;

public class OtherSolve03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();  // N은 사용하지 않으므로 입력만 받는다.
        int sum = 0;

        // getBytes() : 문자열에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 BufferedReader 메소드.
        //              변환되는 방법은 Charset에서 사용되는 인코딩 방식(UTF-16)으로 변경되는 값을 따른다.
        for(byte val : br.readLine().getBytes()) {
            sum += (val - 48);
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
