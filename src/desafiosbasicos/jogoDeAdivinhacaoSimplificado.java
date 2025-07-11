package desafiosbasicos;

import java.util.Scanner;

public class jogoDeAdivinhacaoSimplificado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 99;
        int userNumber;
        System.out.println("Discover the secret number...");
        System.out.println("Enter a number:");
        userNumber = input.nextInt();
        while (userNumber != secretNumber){
            System.out.println("Sorry, try again");
            userNumber = input.nextInt();
        }
        System.out.printf("Congratulations! the %d is the number secret", secretNumber);
        input.close();
    }
}
