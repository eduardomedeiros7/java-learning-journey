package academy.devdojo.maratonajava.introducao;



public class EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int  instalment = 1; instalment <= valorTotal; instalment++) {
            double installmentVale = valorTotal / instalment;
            if (installmentVale < 1000) {
                break;
            }
            System.out.println("Installment " +  instalment + " R$ " + installmentVale);
        }
    }
}
