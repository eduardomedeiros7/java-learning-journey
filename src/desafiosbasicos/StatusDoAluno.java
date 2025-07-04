package desafiosbasicos;

import java.util.Scanner;


public class StatusDoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = 0.0;
        System.out.println("Enter your grade");
        grade = input.nextDouble();

        if (grade > 10.0 || grade < 0.0){
            System.out.println("Invalid Grade");
        } else if (grade >= 7.0) {
            System.out.println("Approved");
        }else if (grade >= 5.0){
            System.out.println("Recovery");
        } else {
            System.out.println("Failed");
        }

    }
}
