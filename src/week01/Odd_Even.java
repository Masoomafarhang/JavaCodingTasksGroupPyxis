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
        System.out.println(OddOrEven(3));
    }

    public static String OddOrEven(int num) {

        return (num % 2==0)?"Even":"Odd";

    }

}
