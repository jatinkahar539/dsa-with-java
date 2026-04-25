import java.util.*;
public class Print_n_times{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        f(n);
    }
    public static void f(int n){
        String name="jatin";
        if(n>0){
            System.out.println(name);
            f(n-1);
        }
        
    }
}