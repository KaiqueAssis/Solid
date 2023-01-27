## Segundo Exemplo

### Princípio aberto-fechado

    O projeto usa o conceito de criação novas classes, utilizando uma classe abstrata, para aplicar o conceito de Ocp que diz que
    Esse principio diz que as classes “devem estar abertas para extensão, mas fechadas para modificação”,

### Contexto do Projeto

    Projeto pergunta quantas a figuras a gente quer calcular a área, e fala o valor de cada uma com um loop for.

### Explicação do Projeto.

    O Projeto tem uma classe abstrata Shape que extende para Rectangle e Circle 
    
    public abstract class Shape {
     private String color;
     public Shape(String color){
     this.color = color;
     }

     public String getColor() {
          return color;
     }

     public abstract double area();
    }

    public class Rectangle extends Shape{


    private double wight;
    private double height;

    public Rectangle(String color, double wight, double height) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double area() {
        return wight * height;
    }
    }

    public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius* radius;
    }
    }

    Assim já aplicamos o principio da Ocp que deixa o as Classe fechada no caso Shape, mas podendo abrir para outros formas de figuras.
    Nas 2 classes temos como calcular a área e pela a função, e definir uma cor.

    No App se pergunta quantas figuras queremos calcular, e depois é feito um loop onde a gente passa as informção de cada objeto para no final
    mostrar o Resultado.

    public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Digite a quantidade de figuras?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++ ){
            System.out.println("A figura "+ i + " tem ");
            System.out.print("Rentangulo ou Circulo? (r/c)");
            char ch = sc.next().charAt(0);
            System.out.println("Escolha a cor que você da sua figura.");
            String color = sc.next();

            if (ch == 'r'){
                System.out.print("Escreva a largura");
                double wight = sc.nextDouble();
                System.out.print("Digite a altura");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, wight, height));
            } else {
                System.out.print("Digite o raio do circulo");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("Area das figuras:");

            for(Shape shape : list){
                System.out.println(String.format("%.2f",shape.area()));
            }


        }
        sc.close();

    }
    }
