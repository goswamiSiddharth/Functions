package function;
import java.util.*;
public class decimalToAnyBase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        System.out.println("Enter base");
        int b=sc.nextInt();
        System.out.println(Base(n,b));
    }

    public static int Base(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int digit=n%b;
            n=n/b;
            rv+=digit*p;
            p=p*10;
        }
        return rv;
        

    }
    
}
