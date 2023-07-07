package function;
import java.util.*;
public class multiplyBase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1=sc.nextInt();
        System.out.println("Enter n2");
        int n2=sc.nextInt();
        System.out.println("Enter base");
        int b=sc.nextInt();
        System.out.println(product(n1,n2,b));

    }
    public static int product(int n1,int n2,int b){
        int rv=0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int prod=multiply(n1,d2,b);
            rv=sum(rv,prod*p,b);
            p=p*10;
        }
        return rv;
    }

    public static int multiply(int n1,int d2,int b){
        int rv=0;
        int c=0;
        int mul=0;
        int p=1;
        while(n1>0 || c>0){
            int d1=n1%10;
            n1=n1/10;
            mul=d1*d2+c;
            c=c/b;
            mul=mul%b;
            rv=rv+mul*p;
            p=p*10;
        }
        return rv;
    }

    public static int sum(int n1,int n2,int b){
        int rv=0;
        int c=0;
        int sum=0;
        int p=1;
        while(n1>0 || c>0 ||n2>0){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            sum=d1+d2+c;
            c=sum/b;
            sum=sum%b;
            rv=rv+sum*p;
            p=p*10;
        }
        return rv;
    }
}
