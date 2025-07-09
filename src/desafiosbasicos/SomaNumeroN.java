package desafiosbasicos;

import java.util.Scanner;

public class SomaNumeroN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int accumulator = 0;
        System.out.println("Enter an integer:");
        number = input.nextInt();
        for (int i = 0; i < number; i++){
            accumulator = accumulator + i;
        }
        System.out.println(accumulator);


    }
}
