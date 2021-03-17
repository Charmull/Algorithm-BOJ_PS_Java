package Java_Basic_Problem01.BOJ_3009;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 중복 값 및 횟수 구하는 방법에 대해 생각하다 복잡하게 코딩함.
    // 모범답안 따로 추가할 것.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] xArr = new Integer[3];
        Integer[] yArr = new Integer[3];

        for(int i = 0; i < 3; i++) {
            int tempX = sc.nextInt();
            int tempY = sc.nextInt();
            if(Arrays.asList(xArr).indexOf(tempX) != -1) {
                xArr[Arrays.asList(xArr).indexOf(tempX)] = null;
            }
            else {
                xArr[i] = tempX;
            }
            if(Arrays.asList(yArr).indexOf(tempY) != -1) {
                yArr[Arrays.asList(yArr).indexOf(tempY)] = null;
            }
            else {
                yArr[i] = tempY;
            }
        }

        int x = 0, y = 0;
        for(int i = 0; i < 3; i++) {
            if(xArr[i] != null) {
                x = xArr[i];
            }
            if(yArr[i] != null) {
                y = yArr[i];
            }
        }
        System.out.println(x + " " + y);
    }
}