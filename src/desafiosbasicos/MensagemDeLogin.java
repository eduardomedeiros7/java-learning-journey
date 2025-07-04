package desafiosbasicos;

import java.util.Scanner;

public class MensagemDeLogin {
    public static void main(String[] args) {
        String message;
        boolean isLogged;

        Scanner input = new Scanner(System.in);
        System.out.println("Are you logged in? (True/false)");
        isLogged = input.nextBoolean();

        message = (isLogged) ? "Welcome in System" : "Please login";
        System.out.println(message);
    }
}
