package week01;

public class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        double a = 12;
        double b = 5;
        double count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else if (a == 0) {
            System.out.println(count);
        } else {
            System.out.println("0");
        }


    }

}
