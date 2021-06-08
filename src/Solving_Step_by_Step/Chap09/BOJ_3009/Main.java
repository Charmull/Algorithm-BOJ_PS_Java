package Solving_Step_by_Step.Chap09.BOJ_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<Integer> setX = new HashSet<Integer>();
        HashSet<Integer> setY = new HashSet<Integer>();

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int tempX = Integer.parseInt(st.nextToken());
            int tempY = Integer.parseInt(st.nextToken());

            if(setX.contains(tempX)) {
                setX.remove(tempX);
            }
            else {
                setX.add(tempX);
            }

            if(setY.contains(tempY)) {
                setY.remove(tempY);
            }
            else {
                setY.add(tempY);
            }
        }

        Iterator resultX = setX.iterator();
        Iterator resultY = setY.iterator();
        while(resultX.hasNext() && resultY.hasNext()) {
            System.out.println(resultX.next() + " " + resultY.next());
        }

        br.close();
    }
}
