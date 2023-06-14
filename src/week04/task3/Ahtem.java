package week04.task3;

public class Ahtem {
    //3️⃣  String - Remove Duplicates
    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {

        System.out.println(duplicatedValues("aaaabbbbccc"));

    }


    public static String duplicatedValues(String str) {

        String notdup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(notdup.contains("" + str.charAt(i)))) {
                notdup += str.charAt(i);
            }


        }return notdup;

    }
}