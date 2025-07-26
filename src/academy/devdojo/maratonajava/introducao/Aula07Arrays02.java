package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        String[] names = {"Carlos", "Eduardo", "Marcelo", "Tesla", "Cadu"};

        System.out.println("--- Array of names--- ");
        System.out.println("First name: " + names[0]);
        System.out.println("Last name: " + names[names.length - 1]);

        System.out.println("\n All names");
        for (int i = 0; i < names.length; i++){
            System.out.println("Name in position " + i + ": " + names[i]);
        }

        System.out.println("---Changing a nam---");
        names[2] = "Mary";
        System.out.println("Name in position 2 after change: " + names[2]);

        System.out.println("All names after changes");
        for (int i = 0; i < names.length; i++ ){
            System.out.println("Name in position " + i + ": " + names[i]);
        }
    }
}
