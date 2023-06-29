package week06.task3;









public class Dildar {
/*String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20

 */
public static void main(String[] args) {
    System.out.println("sumOfAllDigits( \"12 java 5 apple 3\") = " + sumOfAllDigits("12 java 5 apple 3"));
}

    public static int sumOfAllDigits(String str){
        int sum=0;
        for (String each : str.split(" ")) {
            try {
                sum+=Integer.parseInt(each);
            }catch (NumberFormatException e){
                //the element in the array is not parse-able into Integer, Ignore it
            }
        }
      return sum;
    }








}
