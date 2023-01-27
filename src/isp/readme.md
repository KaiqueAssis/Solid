## Quarto Exemplo

###   Princípio de segregação da interface

    Projeto aplicando Isp que diz que nenhum cliente deve ser forçado
    a depender dos métodos que não usa. 

### Contexto do Projeto.
    
    Projeto para darmos descontos aos clientes seja vip ou não olhamos os valores da sua compra passada.

### Explicação do Projeto.

    O projeto tem duas interfaces IClasseCliente e IClasseClienteVip, com os mesmo metódos:
    
    public interface IClasseCliente {

    public String acessData();

    public String nextBuyDiscount();
    }

    public interface IClasseClienteVip {

    public String acessData();

    public String nextBuyDiscount();
    }   
    
    Essas interfaces implementam às Classes Cliente e ClienteVip:
    Obs: Aqui já utilizamos o conceito do Isp onde em cada classe criada utilizamos todos os metodos disponiveis.

    public Cliente(String name, String cpf, String databirth, double valueLastBuy) {
        this.name = name;
        this.cpf = cpf;
        this.data = databirth;
        this.buy = valueLastBuy;
    }

    @Override
    public String acessData() {
        System.out.println("Nome do Cliente "
                        + name
                        + " CPF: "
                        + cpf
                        + " Data: "
                        + data);
        return null;
    }

    @Override
    public String nextBuyDiscount() {
        if(buy > 1000){
            System.out.println("O Cliente tem 10% por conta da sua ultima compra");
        } else {
            System.out.println("Tente compra mais algumas coisas na próxima.");
        }
        return null;
    }
    }

    public class ClienteVip implements IClasseClienteVip {

    private String name, cpf, data;
    private double buy;

    public ClienteVip(String name, String cpf, String databirth, double valueLastBuy) {
        this.name = name;
        this.cpf = cpf;
        this.data = databirth;
        this.buy = valueLastBuy;
    }

    @Override
    public String acessData() {
        return null;
    }

    @Override
    public String nextBuyDiscount() {

        if(buy >450){
            System.out.println("Você irá tem 15% por conta da sua ultima compra.");
        } else {
            System.out.println("Sua compra não bateu o valor na ultima vez vai ter que continuar com 5% de desconto.");
        }
        return null;
    }
    }

    Onde apenas muda a regra de négocio do método nextBuyDiscount.

    Projeto em si instância clientes, se o usuário irar ter desconto.

    public class App {
        public static void main(String[] args){
                        
                        ClienteVip clv = new ClienteVip("jose", "11111231231111111", "20/12/2000", 1000);


                        System.out.println("Vamos analisar o valor da sua ultima compra para ver se o senhor consegue desconto");
                        System.out.println(clv.acessData());
                        System.out.println(clv.nextBuyDiscount());



    }}


