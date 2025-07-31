package reston;

import java.util.Scanner;


public class Reston {

    
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        String name;
        int byear;
        
        System.out.print("Enter name:");
        name=scanner.nextLine();
        System.out.print("Enter birth year:");
        byear=scanner.nextInt();
        int age=2025-byear;
        if(age>=18){
            System.out.println("Votable");  
        }
        else if(age<18){
            System.out.println("Minor");
        }
        else{
            System.out.println("Invalid");
        }
        }
    }
    

