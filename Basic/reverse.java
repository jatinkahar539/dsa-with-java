import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        int num=sr.nextInt();
        System.out.println(num);
        int lastnum=0;
        while(num!=0){
         lastnum= num%10 ; // it give last digit//
        System.out.print(lastnum);
        num=num/10;
        }
    }
}