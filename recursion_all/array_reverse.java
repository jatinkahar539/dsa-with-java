public class array_reverse{
    public static void main(String [] args){
        int arr[]={5,3,4,9,7};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
            System.out.println();
        System.out.print(arr.length);
        // now reverseit
       
       
        rev(arr,0);
            System.out.println();

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    public static void rev(int arr[],int i){
        if(i>=(arr.length)/2){
            return;
        }else{
        int temp = arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        rev(arr,i+1);
        }
        
        
    }
}