import java.util.ArrayList;

class Rectangle extends Shape implements inBox {

    private String name = "Rectangle";

    public String getName() {
        return name;
    }


    @Override
    public void inBoxMethod(ArrayList<String> nameShaps) {
        nameShaps.add(this.name);
    }
}