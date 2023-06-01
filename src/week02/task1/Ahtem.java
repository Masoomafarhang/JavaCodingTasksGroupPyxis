package week02.task1;

public class Ahtem {
    public static void main(String[] args) {
        swapTwoVariable(10,13);
    }
    public static void swapTwoVariable (int a, int b){

        System.out.println("You have entered \nint a= "+a + "\n"+ "int b= "+b);
        System.out.println("After the swapping new variables are ");
        a = a+b;//25

        b=a-b;//25-15=10

        a=a-b; // a = 25-10=15
        System.out.println("int a= "+a+"\n"+ "int b= "+ b);


    }
}
