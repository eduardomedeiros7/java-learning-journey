package desafiosbasicos;

import java.util.Scanner;

public class ContagemProgressivaCondicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;

        System.out.println("Enter a positive integer to start counting");
        number = input.nextInt();

        while (number <= 0){
            System.out.println("Number invalid! please, enter a number positive");
            number = input.nextInt();
        }
        System.out.printf("Starting countdown to %d\n",number );
        while (counter <= number){
            System.out.println(counter);
            counter++;
        }
        System.out.println("Counting finished");
        input.close();
    }
}
