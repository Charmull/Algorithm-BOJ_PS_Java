package BOJ_2754;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        if(temp.equals("F")) {
            System.out.println(0.0);
            return;
        }

        char first = temp.charAt(0);
        char second = temp.charAt(1);
        double result = 0;

        if(first == 'A') {
            result += 4;
        }
        else if(first == 'B') {
            result += 3;
        }
        else if(first == 'C') {
            result += 2;
        }
        else if(first == 'D') {
            result += 1;
        }

        if(second == '+') {
            result += 0.3;
        }
        else if(second == '-') {
            result -= 0.3;
        }
        System.out.println(result);
    }
}