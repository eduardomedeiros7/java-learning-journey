package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        System.out.println("--Example for with continue--");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println("Skipping the even number: " + i);
               // continue; // Pula para próxima iteração (ignora o resto do código para i par)
            }
            System.out.println("Odd number: " + i);
        }
        System.out.println("Loop for finished");
    }
}
