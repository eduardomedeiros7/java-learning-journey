package desafiosbasicos;

import java.util.Scanner;

public class SaudacaoPorPeriodoDoDia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timeOfDay;
        System.out.println("Enter the current time:");
        timeOfDay = input.nextInt();
        if (timeOfDay >= 0  && timeOfDay <= 11){
            System.out.println("Good morning");
        } else if (timeOfDay >= 12 && timeOfDay <= 17){
            System.out.println("Good afternoon");
        } else if (timeOfDay >= 18 && timeOfDay <= 23){
            System.out.println("Good night!");
        }else{
            System.out.println("Invalid time");
        }
    }
}
