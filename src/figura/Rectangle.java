package figura;

public  class Rectangle extends Figura {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double countArea() {
        return a * b;
    }
    @Override
    public double countPerimeter() {
        return 2*(a*b);
    };
}

