package desafiosbasicos;

import java.util.Scanner;


public class MaiorEntreDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int largerNumber;

        System.out.println("Enter the first number integer");
        number1 = input.nextInt();
        System.out.println("Enter the second number integer");
        number2 = input.nextInt();

        largerNumber = (number1 > number2) ? number1 : number2;

        System.out.println("The largest number is " + largerNumber);


    }
}
