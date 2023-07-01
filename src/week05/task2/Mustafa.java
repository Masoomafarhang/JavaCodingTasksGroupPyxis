package week05.task2;

public class Mustafa {
    /*
   Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        System.out.println("getReversed(\"Mustafaa\") = " + getReversed("Mustafaa"));


    }

       public static String getReversed(String str) {
        String reversed = "";
           for (int i = str.length() - 1; i >= 0; i--) {

               char ch = str.charAt(i);

               reversed += ch;

           }

        return reversed;
       }

}
