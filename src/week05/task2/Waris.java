package week05.task2;

public class Waris {
    //Write a function that can reverse a String
    // Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
   reverseStr("ABCD");

    }

   public static String reverseStr (String str ){
       String reverse= "";
        for (int i = str.length()-1; i >= 0 ; i--) {
         reverse += str.charAt(i);
       }
       System.out.println("Reverse("+str + ")==>"+ reverse);
        return reverse;
   }
}
