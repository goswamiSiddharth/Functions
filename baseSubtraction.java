package function;
import java.util.*;
public class baseSubtraction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1=sc.nextInt();
        System.out.println("Enter n2");
        int n2=sc.nextInt();
        System.out.println("Enter base");
        int b=sc.nextInt();
        System.out.println(subtraction(n1,n2,b));
    }

    public static int subtraction(int n1,int n2,int b)
    {
        int rv=0;
        int c=0;
        int diff=0;
        int p=1;
        while( n2>0 ){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            d2=d2+c; 
            if(d2>=d1){
                c=0;
                diff=d2-d1;
            }else{
                c=-1;
                diff=(d2+b)-d1;
            }
            rv=rv+diff*p;
            p=p*10;
        }

        return rv;
    }
}
