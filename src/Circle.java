public class Circle extends Figura {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double countArea() {
        return radius * radius * Math.PI;
    }

    ;

    @Override
    double countPerimeter() {
        return 2 * Math.PI * radius;
    }

    ;
}

