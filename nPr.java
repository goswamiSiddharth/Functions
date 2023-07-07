package function;
import java.util.*;
public class nPr {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter r");
    int r=sc.nextInt();
    
    int nFact=fact(n);
    int rFact=fact(n-r);
    int nPr=nFact/rFact;
    display(nPr);
    }

    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }

    public static void display( int nPr){
        System.out.println(nPr);    
    }

}
