package week02.task2;

import java.util.ArrayList;

public class Zack {
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
    public static void main(String[] args) {


        ArrayList<Integer> devidedBy15 = new ArrayList();
        ArrayList <Integer> devidedBy5 = new ArrayList();
        ArrayList <Integer> devidedBy3 = new ArrayList();

        for (int i = 1; i <=100; i++) {

            if (i%15==0){
                devidedBy15.add(i);
            }
            if (i%3==0 && !(i%5==0)){ // 15
                devidedBy3.add(i);
            }
            if (i%5==0 && !(i%3==0)){
                devidedBy5.add(i);
            }


        }
        System.out.println("Divisible By 15: " + devidedBy15.toString().replace("[","").replace("]",""));
        System.out.println("Divisible By 5: "+ devidedBy5.toString().replace("[","").replace("]",""));
        System.out.println("Divisible By 3:" +devidedBy3.toString().replace("[","").replace("]",""));

    }
}