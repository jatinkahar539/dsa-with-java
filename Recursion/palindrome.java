public class palindrome{
    public static void main(String[] args){
        int n=12211;
        int org=n;
        int rev=palindrome(0,n);
        if(rev!=org){

        System.out.println("not palindrome");
        }else{
        System.out.println(" palindrome");

        }
    }
    public static int palindrome(int i,int n){
        if(n<=0){return i;}
        else{
            int last=n%10;
            i=(i*10)+last;
            n=n/10;
        }
        return palindrome(i,n);
    }
}