package desafiosbasicos;

import java.util.Scanner;

public class PedindoNomeAteSerValido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        System.out.println("Enter your name");
        while (name.isEmpty()){
            System.out.println("please, enter a name valid");
            name = input.next();
        }
        System.out.println("name valid!");
    }
}
