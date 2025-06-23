package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        // && (AND)  || (OR) !
        int age = 30;
        float wage = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && wage >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && wage >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDenrtroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);



    }
}
