

public class Main {
    public static void main(String[] args) {

         Main m = new Main();
         m.drawShape(new Qadr(10));
         m.drawShape(new Circle(17));
         m.drawShape(new Rectangle(12, 10));
//         m.drawShape(new Elipse());
//         m.drawShape(new Sqare());
//         m.drawShape(new Rectangle());


    }

    public void drawShape(Shape shape) {
         System.out.println(shape.getName());
    }
}
