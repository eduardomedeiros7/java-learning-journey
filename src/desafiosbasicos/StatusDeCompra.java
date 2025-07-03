package desafiosbasicos;

import java.util.Scanner;


public class StatusDeCompra {
    public static void main(String[] args) {
        double valueBuyTotal;
        String statusFree = "Free shipping";
        String statusPaid = "FreightCharged";
        String purchaseStauts;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total purchase amount");
        valueBuyTotal = input.nextDouble();

        purchaseStauts = (valueBuyTotal >= 100.0)? statusFree : statusPaid;
        System.out.println(purchaseStauts);




    }
}
