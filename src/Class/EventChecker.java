package Class;

import java.util.Scanner;

class EvenOddChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number == 0) {
                System.out.println("Inputted number Zero");
            } else if (number % 2 == 0) {
                System.out.println("Inputted number is even");
            } else {
                System.out.println("Inputted number is odd");
            }
        }
    }
}