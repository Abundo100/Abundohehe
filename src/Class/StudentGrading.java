package Class;
import java.util.Scanner;

class StudentGrading {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter marks in Science: ");
            int science = scanner.nextInt();
            
            System.out.print("Enter marks in History: ");
            int history = scanner.nextInt();
            
            System.out.print("Enter marks in Math: ");
            int math = scanner.nextInt();
            System.out.print("Enter marks in Soc: ");
            int soc = scanner.nextInt();
            
            System.out.print("Enter marks in Arts: ");
            int arts = scanner.nextInt();
            
            int totalMarks = science + history + math + soc + arts;
            double percentage = (totalMarks / 5.0);
            
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.printf("Total percentage: %.2f\n", percentage);
            
            String remarks;
            if (percentage < 70) {
                remarks = "Fail";
                System.out.println("Remarks: " + remarks);
                System.out.println("Try Again");
            } else if (percentage >= 71 && percentage <= 75) {
                remarks = "Poor";
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + " you Passed.");
            } else if (percentage >= 76 && percentage <= 80) {
                remarks = "Fair";
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + " you Passed.");
            } else if (percentage >= 81 && percentage <= 85) {
                remarks = "Good";
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + " you Passed.");
            } else if (percentage >= 86 && percentage <= 90) {
                remarks = "Very Good";
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + " you Passed.");
            } else if (percentage >= 91 && percentage <= 100) {
                remarks = "Excellent";
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + " you Passed.");
            }
        }
    }
}