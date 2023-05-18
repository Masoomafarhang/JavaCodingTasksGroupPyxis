package week01;

public class Odd_Even {
    /*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */
    public static void main(String[] args) {
          oddOrEven(5);
          oddOrEven(6);
    }
    public static void oddOrEven(int num){

        String result=(num%2==0)?num+" is even number":num+" is odd number";
        System.out.println(result);
    }
}
