package week03.task2;

public class Dildar {
    /* Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

     */
    public static void main(String[] args) {
        System.out.println(reverse(-35));
    }
    public static int reverse(int num) {
        int result=0;
        while (num!=0){
            result=result*10+num%10;
            num=num/10;
        }
        return result;
    }




}
