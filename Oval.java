
public class Oval extends Circle{

    private int radius2;

    public Oval(int radius, int radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    public int getRadius2() {
        return radius2;
    }

    @Override
    public String getName() {
        return String.format("Oval {radius  = %d, circle = %d}", "Rectangle", getRadius(), getRadius2());
    }
}
