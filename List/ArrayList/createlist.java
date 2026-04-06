import java.util.ArrayList;
public class createlist{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(19);
        list.add(10);
        System.out.println(list);
        System.out.println(list.contains(50));
        System.out.println(list.contains(10));

    }
}