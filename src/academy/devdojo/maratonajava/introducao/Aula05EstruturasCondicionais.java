package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 17;
        boolean isAuthorizedBuyDrinks = age >= 18;

        if (isAuthorizedBuyDrinks){
            System.out.println("Authorized to purchase alcoholic beverages");
        }

        if (!isAuthorizedBuyDrinks){
            System.out.println("Not authorized to purchase drinks");
        }

    }
}
