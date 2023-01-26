package lsp;

import java.util.ArrayList;
import java.util.List;

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
