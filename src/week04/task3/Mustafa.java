package week04.task3;

public class Mustafa {
   /* String - Remove Duplicates
    Write a return method that can remove the duplicated values from the String
    Ex: removeDup("AAABBBCCC") ==> ABC */


    public static void main(String[] args) {
        setNonDub("SSSDDDXXX");
    }


    public static void setNonDub(String str) {
        String nonDub = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(nonDub.contains(ch + ""))) {

                nonDub += ch;
            }

        }

        System.out.println(nonDub);

    }


}
