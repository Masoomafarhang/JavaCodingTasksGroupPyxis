package week06.task1;



public class Dildar {
    /*  String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false

     */


    public static void main(String[] args) {

        System.out.println("passwordValidation(\"fDhn12##028\") = " + passwordValidation("fDhn12##028"));
    }

    public static boolean passwordValidation(String str) {
        int isLowerCase = 0, isUpperCase = 0, isDigit = 0, isSpecialChar = 0;
        if (str.length() >= 6 ) {
            for (char each : str.toCharArray()) {
                if (Character.isLowerCase(each)) {
                    isLowerCase++;
                } else if (Character.isUpperCase(each)) {
                    isUpperCase++;
                } else if (Character.isDigit(each)) {
                    isDigit++;
                } else if (!(Character.isLetterOrDigit(each))) {
                    isSpecialChar++;
                }
            }
        }
            if (isLowerCase>=1&&isUpperCase>=1&&isDigit>=1&&isSpecialChar>=1){
                return true;
            }
     return false;
    }

















}
