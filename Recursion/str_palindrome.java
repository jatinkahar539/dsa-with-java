public class str_palindrome{
    public static void main(String[] args){
        String s="madam";
        boolean rev=palindrome(0,s,s.length()-1);
        System.out.println(rev);
    }
    public static boolean palindrome(int i,String s,int end){
        if(i>=end){
            return true;
        }else if(s.charAt(i)!=s.charAt(end)){
            return false;
        }
        return palindrome(i+1,s,end-1);
    }
}
// it give return as true or false