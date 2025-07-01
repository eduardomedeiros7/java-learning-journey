package desafiosbasicos;

import java.util.Scanner;


public class ComparadorDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter two integers:");
        number1 = input.nextInt();
        number2 = input.nextInt();
        if (number1 > number2){
            System.out.println(number1 + " is  greater than " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is greater than " + number1);
        }else{
            System.out.println(" Both numbers equal");
        }


    }
}
