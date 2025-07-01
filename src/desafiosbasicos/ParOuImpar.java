package desafiosbasicos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number integer:");
        number = input.nextInt();
        int result = number % 2;
        if (result == 0){
            System.out.printf(number + " is even");
        }else{
            System.out.print(number + " is odd");
        }
    }
}
