package week04.task3;

public class waris {
//Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println("removeDup(\"AAABBBCCC\") ==> " + removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains(str.charAt(i) + ""))) {
                result += str.charAt(i) + "";
            }
        }
        return result;

    }
}
