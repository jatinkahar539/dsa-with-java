public class largestina{
    public static void main(String[] args){
        int arr[]={1,5,3,4,8};
        int larg=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
                System.out.println(larg);

    }
}