package BOJ_2935;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        String operator = sc.next();
        BigInteger B = new BigInteger(sc.next());

        if (operator.equals("+")) {
            System.out.println(A.add(B));
        }
        else {
            System.out.println(A.multiply(B));
        }
    }
}