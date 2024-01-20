public class Triangle extends Figura {
    int a = 5;
    int b = 2;
    int c = 3;
    int h = 5;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double countPerimeter() {
        return a + b + c;
    }

    ;

    @Override
    double countArea() {
        return (a * h) / 2;
    }
}
