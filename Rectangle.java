public class Rectangle extends Qadr{

    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return String.format("%s {width = %d, heigth = %d}", "Rectangle", getWidth(), getHeight());
    }
}
