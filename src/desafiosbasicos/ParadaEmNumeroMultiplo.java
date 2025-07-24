package desafiosbasicos;

public class ParadaEmNumeroMultiplo {
    public static void main(String[] args) {
        int number = 0;
        while (number <=20){
            number = number + 1;

            if (number % 7 == 0 ){
                System.out.println(number + "is a multiple of 7");
                break;
            }
            System.out.println(number);
        }

    }
}
