package week02.task1;

public class Zack {
    /*
    ========== Numbers -- Swap Numbers =========
    Swap two variable values without using a third variable
    */
    public static void main(String[] args) {

        int a=10, b=20;

        System.out.println("a= "+a+",b= "+b);

        a=a+b;  // a= sum of a and b
        b=a-b;  // a=sum-b
        a=a-b;  // b=sum-a

        System.out.println("a= "+a+",b= "+b);

    }
}
