import java.util.Scanner;

public class armstrongnum{
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        int num=sr.nextInt();
        int ams=0;
        System.out.println(num);
        int dup=num;
        int lastnum=0;
        while(num!=0){
         lastnum= num%10 ; // it give last digit//
        
         ams=ams+(lastnum*lastnum*lastnum);
        System.out.print(ams);
        num=num/10;
        }

                if(ams==dup){
        System.out.print("rev is Armstrong Numbers");
            
        }
        else{
        System.out.print("rev is not Armstrong Numbers");

        }
    }
}