package week02.task1;

public class Zack {
    /*
    ========== Numbers -- Swap Numbers =========
    Swap two variable values without using a third variable
    */
    public static void main(String[] args) {
       swap("abc","defd");swap(4,5);
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
        b=a.substring(0,a.length()-b.length());//7-4=3
        a=a.substring(a.length()-b.length()-1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }




}
