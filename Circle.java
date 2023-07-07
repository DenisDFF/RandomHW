import java.util.ArrayList;

class Circle extends Shape implements inBox{

    private String name = "Circle";

    public String getName() {
        return name;
    }

    @Override
    public void inBoxMethod(ArrayList<String> nameShaps) {
        nameShaps.add(this.name);
    }
}
