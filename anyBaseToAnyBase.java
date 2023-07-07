package function;
import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr n1");
        int n1=sc.nextInt();
        System.out.println("Enter base of n1");
        int b1=sc.nextInt();
        System.out.println("Enter base 2");
        int b2=sc.nextInt();
        System.out.println(getBase( n1, b1, b2));
    }
    public static int getBase(int n1,int b1,int b2){
        int bd=anyBaseToDecimal( n1, b1);
        int db=decimalToAnyBase( bd,b2);
        return db;
    }
    public static int anyBaseToDecimal(int n,int b){
        int rv=0;
        int p1=1;
        while(n>0){
            int digit1=n%10;
            n=n/10;
            rv+=digit1*p1;
            p1=p1*b;
        }
        return rv;
    }

    public static int decimalToAnyBase(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int digit=n%b;
            n=n/b;
            rv=rv+digit*p;
            p=p*10;
        }
        return rv;
    }
    
}
