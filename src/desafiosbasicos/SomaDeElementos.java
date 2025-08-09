package desafiosbasicos;

public class SomaDeElementos {
    public static void main(String[] args) {
        int[] integers = {10, 20, 30, 40,50};
        int sum = 0;

        for (int i = 0; i < integers.length; i++){
            sum += integers[i];
        }
        System.out.println("The sum of all elements within the array is: " + sum);
    }
}
