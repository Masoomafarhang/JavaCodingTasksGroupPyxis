package week01;

public class FINRA {
    /*
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
    public static void main(String[] args) {

        String result="";
        for (int num =1;  num <=30; num++) {

            if (num % 15 == 0) {
                result += "FINRA ";
            } else if (num % 3 == 0) {
                result += "FIN ";
            } else if (num % 5 == 0) {
                result += "RA ";
            } else {
                result += num + " ";
            }
        }
        System.out.println(result);






    }
}

