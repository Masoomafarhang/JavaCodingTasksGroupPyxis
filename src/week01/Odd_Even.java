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


        int [] num={2,1,3,4,5,6,7,8,9,10,12};

        for (int each : num) {
            if(each%2==0){
                System.out.println("Even numbers: "+each);
            }
            if(each%2!=0){
                System.out.println("Odd numbers: "+each);
            }


    }

}
