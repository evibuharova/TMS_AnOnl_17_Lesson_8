public  class Rectangle extends Figura {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double countArea() {
        return a * b;
    }
    @Override
    double countPerimeter () {
        return 2*(a*b);
    };
}

