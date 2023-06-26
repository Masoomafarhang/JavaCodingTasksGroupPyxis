package week02.task3;

import java.io.FilterOutputStream;

public class Masooma {

    /*
    ===== Numbers -- print consecutive numbers ===============
    Write a function that, given a positive integer N, prints the consecutive
    numbers from 1 to N, each on a separate line. However, any number divisible
    by 2, 3 or 5 should be replaced by the word Codility, Test or Coders
    respectively. If a number is divisible by more than one of the numbers:
    2,3 or 5, it should be replaced by a concatenation of the respective words
    Codility, Test and Coders in this given order. For example, numbers divisible
    by both 2 and 3 should be replaced by CodilityTest and numbers divisible by
    all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

    For example, here is the output for N = 17:
    1
    Codility
    Test
    Codility
    Coders
    CodilityTest
    7
    Codility
    Test
    CodilityCoders
    11
    CodilityTest
    13
    Codility
    TestCoders
    Codility
    17
     */
    public static void main(String[] args) {

        int N= 30;

        for (int i= 1; i<= N; i++){
            if (i% 2==0 && i% 3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            } else if (i%2 ==0 && i% 3==0 ) {
                System.out.println("CodilityTest");
            } else if (i% 2==0 && i%5==0 ) {
                System.out.println("CodilityCoders");
            } else if (i% 3==0 && i% 5==0) {
                System.out.println("TestCoders");
            } else if (i% 2==0 ) {
                System.out.println("Codility");
            } else if (i%3== 0) {
                System.out.println("Test");
            } else if (i% 5==0) {
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }

        }
        System.out.println("===============");

        consecutiveNumbers(30);

    }

    public static void consecutiveNumbers(int N){
        for (int i= 1; i<= N; i++){
            String result= "";

            if (i%2==0){
                result+= "Codility";
            }
            if (i%3==0 ) {
                result+= "Test";
            }
            if (i%5==0) {
                result+= "Coders";
            }
            if (result.isEmpty()) {
                result = String.valueOf(i);
            }


            System.out.println(result);
        }

    }
}


