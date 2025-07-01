package desafiosbasicos;

import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = input.nextInt();
        if (age >=18){
            System.out.println("You are of legal age ");
        }else{
            System.out.println("You do not meet the required age");
        }




    }
}