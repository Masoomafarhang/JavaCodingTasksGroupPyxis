package week02.task2;

import java.util.ArrayList;

public class waris {

    public static void main(String[] args) {
        ArrayList<Integer> devidedBy15 = new ArrayList();
        ArrayList<Integer> devidedBy5 = new ArrayList();
        ArrayList<Integer> devidedBy3 = new ArrayList();
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                devidedBy15.add(i);
            }
            if (i % 3 == 0 && !(i % 5 == 0)) {
                devidedBy3.add(i);
            }
            if (i % 5 == 0 && !(i % 3 == 0)) {
                devidedBy5.add(i);
            }


        }
        System.out.println("Divisible By 15: " + devidedBy15.toString().
                replace("[","").replace("]",""));
        System.out.println("Divisible By 5: " + devidedBy5.toString().
                replace("[","").replace("]",""));;
        System.out.println("Divisible By 3: " + devidedBy3.toString().
                replace("[","").replace("]",""));;

    }

}

