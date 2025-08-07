package desafiosbasicos;

public class EncontrarMaiorValor {
    public static void main(String[] args) {

        int[] numbers = {10,20,-30,40,-50};
        int higherValue = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > higherValue){
                higherValue = numbers[i];
            }

        }
        System.out.println("largest number is: " + higherValue);

    }
}
