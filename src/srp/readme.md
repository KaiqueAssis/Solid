# Primeiro exemplo

### Utilizando o principio da responsabilidade única.

    Mini projeto de saque e deposito para utilizar o principio do SRP.(Uma classe deve ter um, e somente um, motivo para mudada. Uma classe tem que ser especializada apenas em uma coisa.)

### Contexto do Projeto
    
    O projeto simula um caixa eletronico com função de saque e deposito
 
### Explicando o Projeto
    
     O projeto consisti na Principal classe Account ele ela tem um construtor, e metodos de get e set, junto com 2 funções que são de saque e deposito
     
    public class Account {
    private int account;
    private String nameAccount;
    private double balance;


    public void Account(int account, String nameAccount){
        this.account = account;
        this.nameAccount = nameAccount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public int getAccount() {
        return account;
    }

    public void setBalance (double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
    } 

    Esse é a classe mais importante no projeto, e junto a essa temos a classe de status da conta que mostra os status padrões:
    
    public class StatesAccount {

    public void state(String name, int Account, double balance){
        System.out.println("Nome da Conta: "
                + name
                +" Numero da Conta: "
                + Account
                + " Salado: $"
                + balance);
    }
    }

    E junto a isso temos As classes de validações ValidAccount, e ValidMoney:

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
    
    ValidAccount a valia se a conta que está sendo acessado é válida, caso não seja o programa é encerrado.

    public class ValidMoney {

    public void valid(double x, double y) {
        if (x >= y) {
            System.out.println("Processando...");
        } else {
            System.out.println("operação nn pode ser realizada");
            System.exit(1);
        }

    }
    }
    
    ValidMoney avalia se é possível fazer um saque, caso não seja possível o valor do saque seja maior que o saldo, o programa é encerrado.
    
    Com isso aplicamos a Srp que recomenda a gente sempre criar várias classes o ideal seria fazer com interfaces só que fiz com classe apenas para dar a ideia de como funciona.

    O programa App em execução pergunta o nome e numero da conta, após isso rola a validação e depois pergunta o valor do deposito faz outra validação e mostra os status, depois acontece
    a mesma coisa mais agora sacando o dinheiro usando o metodo withDraw.

    public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account ac = new Account();
        ValidMoney vm = new ValidMoney();
        ValidAccount vc = new ValidAccount();
        StatesAccount sa = new StatesAccount();

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

