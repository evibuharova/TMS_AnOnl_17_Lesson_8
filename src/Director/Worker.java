package Director;

public class Worker implements Printing {
    String position="Worker";
    public Worker (String position) {
        this.position = position;
    }
    @Override
    public void print() {
        System.out.println("должность: " + position);
    }
}
