package desafiosbasicos;

import java.util.Scanner;

public class TabuadaDeMultiplicacao {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        number = input.nextInt();
        for (int i = 1; i <= number; i++){
           int result = number * i;
            System.out.printf("%d X %s = %d\n", number,i,result);
        }input.close();

    }
}