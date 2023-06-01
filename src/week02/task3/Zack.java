package week02.task3;

import java.util.ArrayList;

public class Zack {

    public static void main(String[] args) {


        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 30 == 0)
                result += "CodilityTestCoders ";
            else if (i % 5 == 0)
                result += "Coders ";
            else if (i % 3 == 0)
                result += "Test ";
            else if (i % 2 == 0)
                result += "Codility ";
            else if (i % 6 == 0)
                result += "CodilityTest ";
            else if (i % 10 == 0)
                result += "CodilityCoders ";
            else if (i % 15 == 0)
                result += "TestCoders ";
            else
                result += i + " ";
        }
        System.out.println(result);
    }
}


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




