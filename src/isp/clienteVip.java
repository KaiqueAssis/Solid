package isp;

public class clienteVip implements IClasseClienteVip{

    private String name, cpf, data;
    private double buy;

    public clienteVip(String name,String cpf, String databirth, double valueLastBuy) {
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
