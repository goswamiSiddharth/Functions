package function;
import java.util.*;
public class baseToDecimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input");
        int n=sc.nextInt();
        System.out.println("Enter base");
        int b=sc.nextInt();
        System.out.println(decimal(n,b));

    }
    public static int decimal(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int digit=n%10;
            n=n/10;
            rv+=digit*p;
            p=p*b;
        }
        return rv;
    }
    
}
