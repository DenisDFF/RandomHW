import java.util.ArrayList;

class Semicircle extends Shape implements inBox {

    private String name = "Semicircle";

    public String getName() {
        return name;
    }


    @Override
    public void inBoxMethod(ArrayList<String> nameShaps) {
        nameShaps.add(this.name);
    }
}