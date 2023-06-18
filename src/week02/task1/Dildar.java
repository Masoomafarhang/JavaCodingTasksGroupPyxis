package week02.task1;

public class Dildar {
    /*
   ========== Numbers -- Swap Numbers =========
   Swap two variable values without using a third variable
   */
    public static void main(String[] args) {
        swap("abcSDHG","defd");swap(4,5);
    }
    public static void swap(int a ,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swap(String a ,String b){
        a=a+b;//"abcdefd"
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }


}
