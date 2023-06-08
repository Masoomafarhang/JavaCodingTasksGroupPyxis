package week03.test2;

public class nadira {
    public static void main(String[] args) {
      reverse(1234);
    }
    public static void reverse(int number) {
        if (number < 0) {
           System.out.println("-");
            reverse(number * -1);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);//
            reverse(number / 10);
        }

    }
}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */