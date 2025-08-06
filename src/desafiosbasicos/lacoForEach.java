package desafiosbasicos;

public class lacoForEach {
    public static void main(String[] args) {

        int[] number = {10,20,30,40,50};

        System.out.println("Looping through an array with for-each");

        for (int num : number){
            System.out.println("Number: " + num);
        }

        String[] fruits = {"banana", "apple", "grape"};

        System.out.println("Looping through the fruit array");

        for (String frut : fruits){
            System.out.println("Fruits: " + frut);
        }
    }
}
