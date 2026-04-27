import java.util.*;
public class FibonacciNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fab(n);
    }
    public static void fab(int n){
        if(n<=1){
            return;
        }
       int last=(n-1);
        int slast=(n-2);
        return (last + slast);
    }
}