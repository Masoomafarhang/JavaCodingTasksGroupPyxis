package week06.task1;

import java.util.Scanner;

public class Masooma {
    /*
     String_PasswordValidation
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
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your password");

        String pass= scan.next();
        System.out.println(isPasswordVerified2(pass));

        if (isPasswordVerified2(pass)== true){
            System.out.println("Your password " + pass+ " is verified");
        }else{
            System.out.println("Your password " + pass+ " is not verified");
        }



    }




    public static boolean isPasswordVerified2(String password){
        if (password.length() < 6) {
            return false;
        }

        if (!containsUppercase(password)) {
            return false;
        }


        if (!containsLowercase(password)) {
            return false;
        }

        if (!containsSpecialCharacter(password)) {
            return false;
        }

        if (!containsDigit(password)) {
            return false;
        }

        return true;

    }

    public static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean containsLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /*
        public static boolean isPasswordVerified(String password1){
        // Requirement 1: Password length should be at least 6 characters
        if (password1.length() < 6) {
            return false;
        }

        // Requirement 2: Password should contain at least one uppercase letter
        if (!password1.matches(".*[A-Z].*")) {
            return false;
        }

        // Requirement 3: Password should contain at least one lowercase letter
        if (!password1.matches(".*[a-z].*")) {
            return false;
        }

        // Requirement 4: Password should contain at least one special character
        if (!password1.matches(".*[!@#$%^&*()\\-=_+\\[\\]{}|;':\",.<>/?].*")) {
            return false;
        }

        // Requirement 5: Password should contain at least one digit
        if (!password1.matches(".*\\d.*")) {
            return false;
        }

        // All requirements met
        return true;
    }
     */

}
