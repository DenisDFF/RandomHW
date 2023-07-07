import java.util.ArrayList;

class Trigel extends Shape implements inBox {

    private String name = "Trigel";

    public String getName() {
        return name;
    }


    @Override
    public void inBoxMethod(ArrayList<String> nameShaps) {
        nameShaps.add(this.name);
    }
}