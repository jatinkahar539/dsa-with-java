public class countdig{
    public static void main(String[] args){
        int num=23445468;
        int count=0;
        while(num !=0){
        int  lastnum= num%10 ; // it give last digit//
        count+=1;
        num=num/10;
        }
        System.out.print(count);
    }
}