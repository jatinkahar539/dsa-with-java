import java.util.*;
public class Sum_of_first_n_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=sums(1,n,0);
        System.out.print(res);
    }
    public static int sums(int i,int n,int sum){
        
        if(i>n){
            return sum;
        }else{
            return sums(i+1,n,sum+i);
        }
        
        
        
    }
}