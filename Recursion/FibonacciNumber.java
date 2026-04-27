import java.util.*;
public class FibonacciNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=fab(n);
        System.out.print(rev);
    }
    public static int fab(int n){
        if(n<=1){
            return n;
        }
      
        return  fab(n-1) + fab(n-2);
    }
}