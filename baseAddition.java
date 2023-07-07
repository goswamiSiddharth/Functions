package function;

import java.util.*;

public class baseAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        System.out.println("Enter base");
        int b = sc.nextInt();
        System.out.println(add(n1, n2, b));

    }

    public static int add(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sum = d1 + d2 + c;
            c = sum / b;
            sum = sum % b;
            rv +=  sum * p;
            p = p * 10;
        }
        return rv;
    }
}
