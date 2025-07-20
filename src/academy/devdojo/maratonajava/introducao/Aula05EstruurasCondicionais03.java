package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;


public class Aula05EstruurasCondicionais03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String ofLegalAge;
        String minor;
        String result;

        System.out.println("Enter your age");
        age = input.nextInt();

        result = (age >= 18)? "of legal age" : "Minor";

        System.out.println(result);



    }
}
