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
            System.out.println(number + " Is even");
        }else{
            System.out.println(number + " Is odd");
        }
    }
}
