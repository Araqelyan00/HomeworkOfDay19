package Task2;

public class Main {
    public static void main(String[] args) {
        TaxAccounting taxes = new TaxAccounting(20,"TaxDep");
        System.out.println("Sum of employers tax = " + taxes.account());

        FinancialAccount finance = new FinancialAccount(5,"FinDep");
        System.out.println("Sum of employers salry = " + finance.account());
    }
}
