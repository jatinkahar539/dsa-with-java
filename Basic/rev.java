import java.util.Scanner;

public class rev{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        int num=sr.nextInt();
        System.out.println("...."+ num);
        int dup=num;
        int reverse=0;

        
        while(num!=0){
        int lastnum= num%10 ; // it give last digit//
        reverse=reverse*10+lastnum;
        System.out.print(lastnum);
        num=num/10;
        }

        System.out.println(" ");
        if(reverse==dup){
        System.out.print("rev is equal to org");
            
        }
        else{
        System.out.print("rev is not equal to org");

        }
    }
}