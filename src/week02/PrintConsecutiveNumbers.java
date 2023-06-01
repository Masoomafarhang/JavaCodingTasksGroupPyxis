package week02;

public class PrintConsecutiveNumbers {
    public static void printConsecutiveNumbers(int N) {
        for (int num = 1; num <= N; num++) {
            if (num % 2 == 0) {
                if (num % 3 == 0) {
                    if (num % 5 == 0) {
                        System.out.println("CodilityTestCoders");
                    } else {
                        System.out.println("CodilityTest");
                    }
                } else if (num % 5 == 0) {
                    System.out.println("CodilityCoders");
                } else {
                    System.out.println("Codility");
                }
            } else if (num % 3 == 0) {
                if (num % 5 == 0) {
                    System.out.println("TestCoders");
                } else {
                    System.out.println("Test");
                }
            } else if (num % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int N = 17;
        printConsecutiveNumbers(N);
    }
}


