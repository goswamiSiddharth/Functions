package function;
import java.util.*;
public class frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        System.out.println("Enter digit");
        int d=sc.nextInt();
        System.out.println(count(n,d));
    }

    public static int count(int n, int d){
        int c=0;
        while(n!=0){
         int digit=n%10;
         n=n/10;
         if(digit==d){
            c++;
        }
    }
    return c;
    }
}
