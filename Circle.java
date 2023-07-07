class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return String.format("Circle {radius = %d}", getRadius());
    }
}
