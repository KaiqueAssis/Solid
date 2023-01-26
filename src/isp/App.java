package isp;


public class App {
        public static void main(String[] args){
                cliente cl = new cliente("kaique", "1111111111111", "20/12/2002", 2000);
                clienteVip clv = new clienteVip("jose", "11111231231111111", "20/12/2000", 1000);


                System.out.println("Vamos analisar o valor da sua ultima compra para ver se o senhor consegue desconto");
                System.out.println(clv.acessData());
                System.out.println(clv.nextBuyDiscount());




        }


}
