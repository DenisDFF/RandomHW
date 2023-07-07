public class Triangle extends Qadr {

    private int side;

    public Triangle(int width, int side) {
        super(width);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getName() {
        return String.format("Tringle {side1 = %d, side2 = %d}", getWidth(), getSide());
    }
}
