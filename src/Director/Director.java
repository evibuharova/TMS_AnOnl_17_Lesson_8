package Director;

public class Director implements Printing {
    String position = "Director";

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println("должность: " + position);
    }
}
