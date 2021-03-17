package Java_Basic_Problem01.BOJ_10102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        String vote = sc.next();
        int A = 0;
        int B = 0;

        for(int i = 0; i < V; i++) {
            if(vote.substring(i, i+1).equals("A")) {
                A++;
            }
            else {
                B++;
            }
        }

        System.out.println(A>B? "A" : (A<B? "B" : "Tie"));
    }
}
