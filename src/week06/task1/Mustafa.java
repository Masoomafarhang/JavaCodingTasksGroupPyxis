package week06.task1;

public class Mustafa {
    /*
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

        System.out.println(checkPassword("Abc@kgfff3"));

    }
    public static boolean checkPassword(String str){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        if(str.length()>=6 && !str.contains(" ")){
        for (char ch:str.toCharArray()) {


            if (Character.isUpperCase(ch)) {

                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;

            } else if (!Character.isLetterOrDigit(ch)) {

                hasSpecialChar = true;
            } else if (Character.isDigit(ch)){

                hasDigit = true;
            }
        }
        }


        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;

    }
}
