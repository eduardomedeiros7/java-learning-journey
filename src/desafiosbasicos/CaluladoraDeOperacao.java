package desafiosbasicos;

import java.util.Scanner;

public class CaluladoraDeOperacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2;
        int operationChoice;

        System.out.println("Enter two numbers:");
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        System.out.println("Choose the desired operation:");
        System.out.println("[1] +");
        System.out.println("[2] -");
        System.out.println("[3] *");
        System.out.println("[4] /");
        System.out.println("Option: ");
        operationChoice = input.nextInt();

        switch (operationChoice){
            case 1:
                double addition = number1 + number2;
                System.out.println("Result: " + addition);
                break;

            case 2:
                double subtraction = number1 - number2;
                System.out.println("Result: " + subtraction);
                break;

            case 3:
                double multiplication = number1 * number2;
                System.out.println("Result: " + multiplication);
                break;

            case 4:
                if (number2 == 0){
                    System.out.println("ERRO: Cannot divide by zero");
                }else{
                    double division = number1 / number2;
                    System.out.println("Result: " + division);
                }
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }

        input.close();
    }
}
