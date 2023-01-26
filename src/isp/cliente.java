package isp;

public class cliente implements iClasseCliente{
    private String name, cpf, data;
    private double buy;



    public cliente(String name,String cpf, String databirth, double valueLastBuy) {
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
            System.out.println("O cliente tem 10% por conta da sua ultima compra");
        } else {
            System.out.println("Tente compra mais algumas coisas na próxima.");
        }
        return null;
    }
}
