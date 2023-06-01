package Week02;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println( "a ="+ a);
        System.out.println("b ="+b);

        String h = "hello";
        String w = "world";

        h=h+w;
        w=h.substring(0,h.length()-w.length());
        h=h.substring(w.length());
        System.out.println("w "+w);
        System.out.println("h "+h);

    }
}
/*
 Numbers -- Swap Numbers
Swap two variable values without using a third variable


 */