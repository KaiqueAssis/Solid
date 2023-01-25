package srp;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account ac = new Account();
        validMoney vm = new validMoney();
        validAccount vc = new validAccount();
        statesAccount sa = new statesAccount();

        // Digite o número "1000" para passar na verificação.
        System.out.println("Digite o numero para criar a sua conta.");
        int account = sc.nextInt();

        // Digite o Nome "José" para passar na verificação
        System.out.println("Digite o seu nome");
        String name = sc.next();


        vc.validAccount(name, account);

        ac.Account(account, name);

        System.out.println("Digite o valor do seu deposito");
        double deposit = sc.nextDouble();
        ac.setBalance(deposit);

        sa.state(ac.getNameAccount(), ac.getAccount(), ac.getBalance());

        System.out.println("Qual o valor em dinheiro que você quer tirar?");
        double dinheiro = sc.nextDouble();

        vm.valid(ac.getBalance(), dinheiro);

        ac.withDraw(dinheiro);

        sa.state(ac.getNameAccount(), ac.getAccount(), ac.getBalance());


    }
}
