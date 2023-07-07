import java.util.ArrayList;
import java.util.Random;

class ShapeTest {
    public static void main(String[] args) {
        Random randommasivnumber = new Random();
        int a = randommasivnumber.nextInt(100);
        int b = randommasivnumber.nextInt(100);
        int[] numbers = {a, b};
        ArrayList<String> nameShaps = new ArrayList<>();
        Circle circlename = new Circle();
        circlename.inBoxMethod(nameShaps);
        Qadr qadrname = new Qadr();
        qadrname.inBoxMethod(nameShaps);
        Trigel trigelName = new Trigel();
        trigelName.inBoxMethod(nameShaps);
        Semicircle semicircleName = new Semicircle();
        semicircleName.inBoxMethod(nameShaps);
        Rectangle RectangleName = new Rectangle();
        RectangleName.inBoxMethod(nameShaps);
        GetName getName = new GetName();
        getName.randomShape(nameShaps, numbers);



        // TakeName takeName = new TakeName();
        // takeName.takeNameShapes(nameShaps);
    }
}

class Shape {            //базовий класс Shape
    private String name;
}

interface inBox{
    void inBoxMethod(ArrayList<String> nameShaps);
}

//фiгури


//повинен бути клас, що приймає фігуру, та виводить її назву. Клас повинен працювати саме з базовим класом Shape.

class GetName{
    public void randomShape(ArrayList<String> nameShaps, int[] numbers) {
        Random random = new Random();
        int index = random.nextInt(nameShaps.size());
        String selectedShape = nameShaps.get(index);
        if (selectedShape == "Circle") {
            System.out.println("radius = " + numbers[0] / 2  + "{" + selectedShape + "}");
        } else if (selectedShape == "Semicircle") {
            System.out.println("Сircle = " + + numbers[0] / 4 + "{" + selectedShape + "}");
        } else if (selectedShape == "Rectangle") {
            System.out.println("P = "+ numbers[0] * numbers[1] + "{" + selectedShape + "}");
        } else if (selectedShape == "Trigel") {
            System.out.println("A + B + C = "+ (numbers[0] + numbers[0] + numbers[1]) + "{" + selectedShape + "}");
        } else {
            System.out.println("Side = " + numbers[0] * numbers[0] + "{" + selectedShape + "}");
        }
    }
}
