package week02.task1;

public class Masooma {
     /*
    ========== Numbers -- Swap Numbers =========
    Swap two variable values without using a third variable
    */
     public static void main(String[] args) {
         int a= 10, b= 5;
         a= a+b; //a= 15
         b= a-b; //b= 15-5= 10
         a= a-b; //a= 15-10= 5
         System.out.println("a = " + a);
         System.out.println("b = " + b);
     }
}
