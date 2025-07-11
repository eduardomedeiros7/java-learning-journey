package desafiosbasicos;

import java.util.Scanner;

public class SomadorDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter whole numbers to add ( enter a negative number to stop)");
        number = input.nextInt();

        while (number >=0){
            sum = sum + number;
            System.out.println("Enter the next number (negative to stop)");
            number = input.nextInt();
        }
        System.out.printf("The total sum of the numbers is: %d", sum);

        input.close();
    }
}
