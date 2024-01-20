import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figure = new Figura [5];
        figure[0]= new Circle(3);
        figure[1]= new Circle(4);
        figure[2]= new Circle(5);
        figure[3]= new Triangle(5,5,5,5);
        figure[4]= new Rectangle(5,2);
        System.out.println(figure[0].countPerimeter());
        System.out.println(figure[1].countPerimeter());
        System.out.println(figure[2].countPerimeter());
        System.out.println(figure[3].countPerimeter());
        System.out.println(figure[4].countPerimeter());
        System.out.println(figure[0].countArea());
        System.out.println(figure[1].countArea());
        System.out.println(figure[2].countArea());
        System.out.println(figure[3].countArea());
        System.out.println(figure[4].countArea());
    }
}