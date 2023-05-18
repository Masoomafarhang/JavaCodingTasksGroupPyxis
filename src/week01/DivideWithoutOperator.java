package week01;

public class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        divideWithoutOperator(15,5);
    }
    public static void divideWithoutOperator(int a,int b){ //a/b=c  15/5=3  15-5=10 10-5=5  5-5=0
        int count=0;
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count);
    }
}
