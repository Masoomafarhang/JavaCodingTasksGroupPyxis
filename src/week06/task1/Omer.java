package week06.task1;

public class Omer {


        public static boolean PasswordValidation(String password) {
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        for (int i = 0; i < password.length(); i++) {
            char c=password.charAt(i);
            if(Character.isUpperCase(c)){
                hasUppercase=true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase=true;
            } else if (Character.isDigit(c)) {
                hasDigit=true;
            }else{
               hasSpecialChar=true;
            }

        }


        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
        }

    public static void main(String[] args) {


            String password="Omer1212";
        System.out.println(PasswordValidation(password));
    }



}

/*1️⃣  String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false

2️⃣  Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

3️⃣ String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20*/