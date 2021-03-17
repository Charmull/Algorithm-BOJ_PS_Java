package Java_Basic_Problem01.BOJ_1934;

import java.util.Scanner;

public class Main {
    public int greatest(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if(b == 0) {
            return a;
        }
        return greatest(b, a%b);
    }

//    public int greatest(int a, int b) {
//        while(true) {
//            if(a < b) {
//                int temp = a;
//                a = b;
//                b = temp;
//            }
//
//            if(a % b == 0) {
//                return b;
//            }
//            else {
//                a %= b;
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Main test = new Main();

        for(int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int greatest = test.greatest(a, b);
            System.out.println((a / greatest) * (b / greatest) * greatest);
        }
    }
}