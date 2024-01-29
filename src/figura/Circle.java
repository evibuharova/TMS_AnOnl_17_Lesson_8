package figura;

public class Circle extends Figura {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * radius;
    }

}

