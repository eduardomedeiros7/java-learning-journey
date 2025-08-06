package desafiosbasicos;

public class ArrayDeStringInicializacaoDireta {
    public static void main(String[] args) {
        String[] names = {"Messi", "Ronaldo", "Carlos", "Ronaldinho"};

        System.out.println("Array of names");
        System.out.println("First name: " + names[0]);
        System.out.println("Last name: " + names[names.length - 1]);

        for (int i = 0; i < names.length; i++){
            System.out.println("Name in position " + i + ": " + names[i]);
        }

        System.out.println("Changing a name");
        names[0] = "Eduardo";
        System.out.println("Name in position 0 after change:  " + names[0]);

        System.out.println("Names after change: ");
        for (int i = 0; i < names.length; i++){
            System.out.println("Name in position " + i + ": " + names[i]);
        }




    }
}
