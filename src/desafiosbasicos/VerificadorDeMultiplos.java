package desafiosbasicos;

import java.util.Scanner;

public class VerificadorDeMultiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter integers (enter 0 to end the program)");
        number = input.nextInt();

        while (number !=0){
            if (number % 3 == 0 && number % 5 == 0){
                System.out.println(number + " is a multiple of 3 and 5");
            } else if (number % 3 == 0) {
                System.out.println(number + " is a multiple of 3");
            } else if (number % 5 == 0) {
                System.out.println(number + " is a multiple de 5");
            }else{
                System.out.println("It is not a multiple of 3 or 5");
            }

            System.out.println("Enter another number (enter 0 to exit)");
            number = input.nextInt();

        }
        System.out.println("Program closed");
        input.close();
    }
}
