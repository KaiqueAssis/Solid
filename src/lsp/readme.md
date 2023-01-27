## Terceiro Exemplo

###  Princípio de substituição de Liskov 

    O projeto de figuras usa o Lsp que diz que se a classe A for um subtipo da classe B , poderemos substituir B por A sem interromper o comportamento do nosso programa

### Contexto do Projeto

    O projeto calcula a área de figuras de uma lista.

### Explicando o Projeto

    O projeto tem uma classe abstrata Shape que extende para a Class Rectangle:

    public abstract class Shape {

    public abstract double area();
    }

    public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }
    


    @Override
    public double area() {
        return width * height;
    }
    }

    Na classe Rectagle temos o metodo area com Override que calcula a área de um retangulo, e temos um construtor que determinar o valor das váriaveis.
    Após isso temos o Quadrate que é filho do Rectangle:

    public class Quadrate extends Rectangle{

    private double side;
    private double width;

    public Quadrate(double side){
        this.side = side;

    }

    public Quadrate(double side, double width){
        this.side = side;
        this.width = width;
    }


    @Override
    public double area() {

        if (width <= 0) {
            return Math.pow(side, 2);
        } else if (width >= 0) {
            return side * width;
        }
        return 0;
    }

    }
    
    Onde temos 2 construtores um com um parametro, e outro com 2. E temos a area que foi modificada para satisfazer o Lsp.

    No App é testado, onde ele cria uma Lista e cria 4 objetos para testar o código satisfazendo o principio Loskov.
    
    public class App {
        public static void main(String[] args) {
            List<Shape> obj = new ArrayList<>();

            Rectangle rec = new Rectangle(5,4);
            Rectangle rec1 = new Rectangle(5,10);

            Quadrate qdr = new Quadrate(5);
            Quadrate qdr1 = new Quadrate(5, 10);

            obj.add(rec);
            obj.add(qdr1);
            obj.add(qdr);
            obj.add(rec1);
            for (Shape rectangle : obj)
                System.out.println(rectangle.area());
            }
        }



.