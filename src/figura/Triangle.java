package figura;

import figura.Figura;

public class Triangle extends Figura {
    private int a = 5;
    private int b = 2;
    private int c = 3;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double countPerimeter() {
        return a + b + c;
    }

    @Override
    public double countArea() {
        int h = 5;
        return (a * h) / 2;
    }
}
