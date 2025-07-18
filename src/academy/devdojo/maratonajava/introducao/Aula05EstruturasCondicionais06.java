package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte day;
        Scanner input = new Scanner(System.in);
        day = input.nextByte();

        switch(day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Business day");
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
        input.close();
    }
}
