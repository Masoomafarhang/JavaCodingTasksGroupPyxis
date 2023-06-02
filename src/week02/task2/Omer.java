package week02.task2;

import java.util.ArrayList;
import java.util.List;

public class Omer {

    public static void main(String[] args) {

/*//we can also use ArrayList instead of List

        List<Integer> divisibleBy15 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();

        for (int num = 1; num <= 100; num++) {
            if (num % 15 == 0) {
                divisibleBy15.add(num);
            } else if (num % 5 == 0) {
                divisibleBy5.add(num);
            } else if (num % 3 == 0) {
                divisibleBy3.add(num);
            }
        }

        System.out.print("Divisible By 15: ");
        for (int num : divisibleBy15) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Divisible By 5: ");
        for (int num : divisibleBy5) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Divisible By 3: ");
        for (int num : divisibleBy3) {
            System.out.print(num + " ");
        }
        System.out.println();*/

        ArrayList<Integer> divisibleNumbers = new ArrayList<>();

        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 15 != 0) {
                divisibleNumbers.add(num);
            }
        }

        System.out.print("Divisible By 3: ");
        for (int num : divisibleNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        divisibleNumbers.clear();

        for (int num = 1; num <= 100; num++) {
            if (num % 5 == 0 && num % 15 != 0) {
                divisibleNumbers.add(num);
            }
        }
        System.out.print("Divisible By 5: ");
        for (int num : divisibleNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        divisibleNumbers.clear(); // Clear the list for the next category

        for (int num = 1; num <= 100; num++) {
            if (num % 15 == 0) {
                divisibleNumbers.add(num);
            }
        }
        System.out.print("Divisible By 15: ");
        for (int num : divisibleNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
  /*
    ========= Numbers -- Divisible by 3, 5, 15 ==============
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    -if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
    -if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
    -if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section

    ex:
    OutPut:
        Divisible By 15 15 30 45 60 75 90
        Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
        Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */