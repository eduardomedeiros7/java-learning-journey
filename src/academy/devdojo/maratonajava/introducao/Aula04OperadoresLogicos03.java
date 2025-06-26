package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresLogicos03 {
    public static void main(String[] args) {

        double valueTotalCurrentAccount = 200;
        double valueTotalSavingsAccount = 10000;
        float valuePlaystation = 5000;

        boolean isCanBuyPlaystation = valueTotalCurrentAccount > valuePlaystation
                || valueTotalSavingsAccount > valuePlaystation;
        System.out.println("Can I buy the playstation? " + isCanBuyPlaystation);


    }
}
