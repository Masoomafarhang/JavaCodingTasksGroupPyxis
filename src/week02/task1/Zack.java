package week02.task1;

public class Zack {
    /*
    ========== Numbers -- Swap Numbers =========
    Swap two variable values without using a third variable
    */
    public static void main(String[] args) {
    swapTwoVariable(11,33);


    }
    public static void swapTwoVariable (int a, int b){
        System.out.println("You have entered \nint a= "+a + "\n"+ "int b= "+b);
        System.out.println("After the swapping new variables are ");
        a = a+b;//25

        b=a-b;//25-15=10

        a=a-b; // a = 25-10=15
        System.out.println("int a= "+a+"\n"+ "int b= "+ b);

   /*
        // Solution 1:============================
        int  a = 10;      int  b  = 20;
        a = a + b;
        b = a - b;
        a = a - b;

      Solution 2: ===========================
        int  a = 10;      int  b  = 20;
        a = a * b;
        b = a / b;
        a = a / b;
        */

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
