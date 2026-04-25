import java.util.*;
public class factorial_of_n{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=facto(1,n,1);
        System.out.print(res);
    }
    public static int facto(int i,int n,int fact){
        
        if(i>n){
            return fact;
        }else{
            return facto(i+1,n,fact*i);
        }
        
        
        
    }
}