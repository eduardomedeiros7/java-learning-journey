package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class GerenciadorDescontos {
    public static void main(String[] args) {
        double discount = 0;
        double discountApplied = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the original price of the product?");
        double originalPrice = input.nextDouble();
        System.out.println("What is the product category? [1]Electromics [2]Clothes [3]Food");
        int categoryProduct = input.nextInt();
        if (categoryProduct == 1 && originalPrice >= 1000){
             discount = (15.0/100.0) * originalPrice;
            System.out.printf("Original price R$%.2f\n " , originalPrice);
            System.out.printf("Your discount is R$%.2f\n " , discount);
            discountApplied = originalPrice - discount;
            System.out.printf("Price with discount applied R$%.2f", discountApplied);
        } else if (categoryProduct == 2 && originalPrice <= 200) {
             discount = (10.0/100.0) * originalPrice;
            System.out.printf("Original price R$%.2f\n " , originalPrice);
            System.out.printf("Your discount is R$%.2f\n " , discount);
            discountApplied = originalPrice - discount;
            System.out.printf("Price with discount applied R$%.2f ", discountApplied);
        } else if (categoryProduct == 3){
            discount = originalPrice - 5.0;
            System.out.printf("Original price R$%2.f\n " , originalPrice);
            System.out.printf("Your discount is R$%.2f\n " , discount);
            discountApplied = originalPrice - discount;
            System.out.printf("Price with discount applied R$%.2f ", discountApplied);
        }else{
            System.out.println("Sorry, there is no discount for this item!");
        }
        input.close();
    }
}
