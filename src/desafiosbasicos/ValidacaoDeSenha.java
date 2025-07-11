package desafiosbasicos;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userPassWord;
        String secretPassword = "AprendendoJava2025";
        int attempts = 0;
        System.out.println("Enter a password...");
        userPassWord = input.next();
        while (!userPassWord.equalsIgnoreCase(secretPassword) && attempts <3){
            attempts++;
            if (attempts == 3){
                System.out.println("Access blocked after too many attempts!");
                input.close();
                return;
            }
            System.out.println("Password invalid! Try again");
            userPassWord = input.next();
        }

        if (userPassWord.equalsIgnoreCase(secretPassword)){
            System.out.println("Correct password");
        }
        input.close();
    }
}
