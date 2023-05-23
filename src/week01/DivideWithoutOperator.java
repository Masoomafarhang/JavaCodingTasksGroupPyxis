package week01;

public  class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        System.out.println(Calculator(100, 10));
   //1
    }



    public static int Calculator (int a , int b){
        int count =0;
        System.out.print(a + " divided by " + b +" is " );
        while(a>=b){
            a-=b;
            count++;

        }

        return count;
    }

     


}

