package desafiosbasicos;

import java.util.Scanner;

public class CalculadoraDeMediaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade;
        double totalScore = 0.0;
        int numberOfNotes = 0;

        System.out.println("Enter grades (enter a negative number to finalize):");
        grade = input.nextDouble();

        while ( grade >=0){
            totalScore += grade;
            numberOfNotes++;

            System.out.println("Enter the next note (Negative to end):");
            grade = input.nextDouble();
        }

        if (numberOfNotes > 0){
            double studentAverage = totalScore / numberOfNotes;
            System.out.printf("Total notes entered: %d", numberOfNotes);
            System.out.printf("Sum of grades: %.2f" , totalScore);
            System.out.printf("Grades point average: %.2f", studentAverage);
        }else{
            System.out.println("No valid grades were entered to calculate the average");
        }
        input.close();
    }
}
