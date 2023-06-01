package week02.task3;
import java.util.ArrayList;
public class waris {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 30 == 0)
                result += "CodilityTestCoders ";
            else if (i % 5 == 0)
                result += "Coders ";
            else if (i % 3 == 0)
                result += "Test ";
            else if (i % 2 == 0)
                result += "Codility ";
            else if (i % 6 == 0)
                result += "CodilityTest ";
            else if (i % 10 == 0)
                result += "CodilityCoders ";
            else if (i % 15 == 0)
                result += "TestCoders ";
            else
                result += i + " ";
        }
        System.out.println(result);
    }
    }



