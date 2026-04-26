public class Reverse_array{
    public static void main(String [] args){
        int arr[]={5,3,4,9,7};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
            System.out.println();
        System.out.print(arr.length);
        // now reverseit
       
       
        for(int i=0;i<arr.length/2;i++){
           
                
            int temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
           
            
        }
            System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}