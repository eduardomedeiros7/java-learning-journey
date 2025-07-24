package desafiosbasicos;

public class PulandoPares {
    public static void main(String[] args) {
        int number;
        for (number = 1; number <= 30; number++){
           if (number % 2 == 0){
               continue;
            }
            System.out.println( number + " is odd");


        }
    }
}
