package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        int[] number;

        number = new int[8];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        number[5] = 60;
        number[6] = 70;
        number[7] = 80;


        //System.out.println("---integer array---");
        //System.out.println("Element in index 0: " + number[0]);
        //System.out.println("Element in index 3: " + number[3]);
        for (int i = 0; i < number.length; i++){
            System.out.println("Element in index " + i + ":" + number[i]);
        }
    }
}
