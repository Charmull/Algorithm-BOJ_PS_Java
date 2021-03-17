package Java_Basic_Problem01.BOJ_10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int i;
        for(i = 0; i < input.length()/2; i++) {
            if(input.charAt(i) == input.charAt(input.length()-1-i)) {
                continue;
            }
            else {
                break;
            }
        }

        System.out.println(i == input.length()/2? 1 : 0);
    }
}
