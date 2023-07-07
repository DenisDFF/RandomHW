class Qadr extends Shape {

    private int width;

    public Qadr(int width) {
       this.width = width;
    }

    public int getWidth() {
        return width;
    }



    @Override
    public String getName() {
//        return "Qadr" + " {width = "+ width + "}";
    return String.format("Qadr {width = %d}", getWidth());
    }
}


