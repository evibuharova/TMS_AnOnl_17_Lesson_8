package Director;

public class Worker implements Printing {
    @Override
    public void print() {
        System.out.println("должность: " + "Worker");
    }
}
