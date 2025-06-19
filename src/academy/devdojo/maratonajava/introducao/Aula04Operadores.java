package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        int resultSum = number1+ number2;
        int resultMultiplication = number1 * number2;
        int resultDivision = number2 / number1;
        int rest = number2 % number1;

        System.out.println("Sum: " + resultSum);
        System.out.println("Multiplication: " + resultMultiplication);
        System.out.println("Division : " + resultDivision);
        System.out.println("The remainder of " + number2 + " divided by " + number1
        + " is " + rest);

        boolean isTenBiggerOne = true;
        boolean isDifferent;
        System.out.println("Ten is greater than one?" + isTenBiggerOne);
        if (number1 != number2) {
            System.out.println(number1 + " end" + number2 + " are different!");
        } else{
            System.out.println("The numbers are the same");
        }
        if (resultSum > 30 && resultSum < 32){
            System.out.println("Lucky number is 31" );
        }else{
            System.out.println("Not this time");

        }


    }
}
