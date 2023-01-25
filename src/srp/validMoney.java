package srp;

public class validMoney {

    Account ac = new Account();
    public void valid(double x, double y) {
        if (x >= y) {
            System.out.println("Processando...");
        } else {
            System.out.println("operação nn pode ser realizada");
            System.exit(1);
        }

    }


}
