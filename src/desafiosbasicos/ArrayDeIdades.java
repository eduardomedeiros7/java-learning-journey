package desafiosbasicos;

public class ArrayDeIdades {
    public static void main(String[] args) {
        int [] ages = {20,21,22,23,24,30,99};
        System.out.println(" Age of the third person: " + ages[2]);
        for (int i = 0; i < ages.length; i++){
            System.out.println("Age "+ ages[i]);
        }
    }
}
