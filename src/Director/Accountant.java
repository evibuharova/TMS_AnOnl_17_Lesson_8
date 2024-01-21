package Director;

public class Accountant implements Printing {
    String position="Accountant";
    public Accountant (String position) {
        this.position = position;
    }
    @Override
    public void print() {
        System.out.println("должность: " + position);
    }
}
