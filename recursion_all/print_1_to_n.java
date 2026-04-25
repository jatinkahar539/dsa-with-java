import java.util.*;
public class Print_1_to_n{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        f(1,n);
    }
    public static void f(int i,int n){
        
        if(i>n){
            return;
        }else{

            System.out.println(i);
            f(i+1,n);
        }
        }
        
    
}