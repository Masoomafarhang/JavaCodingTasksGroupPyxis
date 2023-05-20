package week01;

public class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        System.out.println( divideWithoutOperator(15,2));

    }
    public static int divideWithoutOperator(int a,int b){
        int count=0;
        while (a>=b){
            a-=b;
            count++;
        }
        return count;
    }
}
