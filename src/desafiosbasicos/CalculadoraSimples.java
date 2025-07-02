package desafiosbasicos;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        String operation;

        System.out.println("Enter the first number:");
        number1 = input.nextDouble();
        System.out.println("Enter the second number");
        number2 = input.nextDouble();
        System.out.println("Choose the operation [+] [/] [*] [-]");
        operation = input.next();

        if (number2 == 0 && operation.equalsIgnoreCase("/")){
            System.out.println(" ERRO! " + number2 + "is a mathematical uncertainty ");
            return;
        } else if (operation.equalsIgnoreCase("+")) {
            double addition = number1 + number2;
            System.out.println("The sum of the numbers is " + addition);
        } else if (operation.equalsIgnoreCase("/")) {
            double division = number1 / number2;
            System.out.println(number1 + " divided by " + number2 + " is: " + division);
        } else if (operation.equalsIgnoreCase("*")) {
            double multiplication = number1 * number2;
            System.out.println(number1 + " multiplied by " + number2 + " is: " + multiplication);
        } else if (operation.equalsIgnoreCase("-")) {
            double subtraction = number1 - number2;
            System.out.println(number1 + " subtracted by " + number2 + " is: " + subtraction);
        }else{
            System.out.println("invalid option");
        }
        input.close();

    }

}
