package srp;

public class ValidAccount {

    public void validAccount(String x, int y) {
        if(x.equals("José") && y == 1000){
            System.out.println("Conta Acessada");
        } else {
            System.out.println("Nenhuma conta foi acessada");
            System.exit(1);
        }
    }
}
