package srp;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account ac = new Account();

        System.out.println("Digite o numero para criar a sua conta.");
        int account = sc.nextInt();
        ac.setAccount(account);


        System.out.println("Digite o seu nome");
        String name = sc.next();
        ac.setNameAccount(name);

        System.out.println("Vai ter deposito inicial? sim/nao");
        String confirm = sc.next();

        if(confirm.equals("sim")){
            System.out.println("Valor do aporte inicial");
            double firstDeposit = sc.nextDouble();
            ac.setDeposit(firstDeposit);
        } else {
            System.out.println("ok");
        }

    }
}
