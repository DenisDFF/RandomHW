import java.util.ArrayList;

public class Qadr extends Shape implements inBox{

    private String name = "Qadr";

    public String getName() {
        return name;
    }


    @Override
    public void inBoxMethod(ArrayList<String> nameShaps) {
        nameShaps.add(this.name);
    }
}