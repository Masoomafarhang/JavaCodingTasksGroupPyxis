package Week02.Task3;

public class Mustafa {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a= a+b; //15
        b=a-b; //10
        a=a-b; // 5

        System.out.println( "a ="+ a);
        System.out.println("b ="+b);




        String h = "hello";
        String w = "worldWide";

        h=h+w;//helloworld
        w=h.substring(0,h.length()-w.length()); // hello
        h=h.substring(w.length()); // world

       System.out.println("w "+w);
        System.out.println("h "+h);

    }
}
/*
 Numbers -- Swap Numbers
Swap two variable values without using a third variable


 */