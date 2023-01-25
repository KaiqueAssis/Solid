package ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle cr;
        Rectangle rc;
        List<Shape> list = new ArrayList<>();

        System.out.print("Digite a quantidade de figuras?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++ ){
            System.out.println("A figura "+ i + " tem ");
            System.out.print("Rentangulo ou Circulo? (r/c");
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
