import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter marks in Science: ");
            int science = scanner.nextInt();
            
            System.out.print("Enter marks in History: ");
            int history = scanner.nextInt();
            
            System.out.print("Enter marks in Math: ");  // Fixed typo here (was System.outaprint)
            int math = scanner.nextInt();
            
            System.out.print("Enter marks in Soc: ");
            int soc = scanner.nextInt();
            
            System.out.print("Enter marks in Arts: ");
            int arts = scanner.nextInt();
            
            int total = science + history + math + soc + arts;
            double percentage = (total / 500.0) * 100;
            
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Total percentage: %.2f\n", percentage);
            
            String remarks;
            if (percentage < 70) {
                remarks = "Fail";
            } else if (percentage >= 71 && percentage <= 75) {
                remarks = "Poor";
            } else if (percentage >= 76 && percentage <= 80) {
                remarks = "Fair";
            } else if (percentage >= 81 && percentage <= 85) {
                remarks = "Good";
            } else if (percentage >= 86 && percentage <= 90) {
                remarks = "Very Good";
            } else {
                remarks = "Excellent";
            }
            
            System.out.println("Remarks: " + remarks);
            
            if (percentage >= 70) {
                System.out.println("Congrats " + name + " you Passed.");
            } else {
                System.out.println("Try Again " + name);
            }
        }
    }
}