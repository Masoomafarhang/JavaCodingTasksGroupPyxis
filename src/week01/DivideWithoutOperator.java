package week01;

public class DivideWithoutOperator {




        public static void main(String[] args) {
            int a = 50;
            int b = 9;

            int count = 0;

            while (a >= b) {
                a -= b;
                count++;
            }

            System.out.println(count+" with a remainder of "+a);

    }



}
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */