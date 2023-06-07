package week02.task3;

import java.util.Scanner;

public class Ahtem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int N = input.nextInt();
        task3(N);
    }



    public static void task3(int N) {

        String result = "";

        for(int i=1; i <= N; i++) {
            if (i % 2 ==0 && i % 3 == 0 && i % 5 == 0)
                result += "\nCodilityTestCoders";
            else if (i % 2 ==0 && i % 5 ==0)
                result +="\nCodilityCoders";
            else if (i%2==0 && i%3==0)
                result+="\nCodilityTest";
            else if(i % 2==0)
                result += "\nCodility";
            else if(i%3 == 0)
                result += "\nTest ";
            else if(i%5==0)
                result+="\nCoders";




            else
                result += "\n"+i;
        }
        System.out.println(result);
    }
}
