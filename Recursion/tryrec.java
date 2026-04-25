public class tryrec{
    public static void main(String[] args){
    f();
}
public static void f(){
    System.out.print("1");
    f();
}
}
// it print infinite time 1 and infinite time call and call and call f()