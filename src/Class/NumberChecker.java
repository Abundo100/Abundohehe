package Class;

import java.util.Scanner;

class NumberChecker {
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println(number + " is a positive number");
            } else if (number < 0) {
                System.out.println(number + " is a negative number");
            } else {
                System.out.println("Inputted number is Zero");
            }
        }
    }
}