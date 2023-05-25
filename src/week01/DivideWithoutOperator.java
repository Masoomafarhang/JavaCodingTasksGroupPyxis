package week01;

public class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */
/*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */

    public static void divideWithoutOperator(double a,double b){

        int count=0;
        while (a>=b) {
            a-=b;// >> a = (a-b)>>
            count++;//+1
        }
        System.out.println(count+" reminder "+a);
    }

    //10 / 2= 5
    // 10 % 2 == 0
    // reminder = leftover
    public static void main(String[] args) {
        divideWithoutOperator(14,3);
        //       20  | 6,666666
        //       20

        int c =11;
        int d= 5;





    }

}
