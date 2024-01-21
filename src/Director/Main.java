package Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Director");
        Worker worker = new Worker("Worker");
        Accountant accountant = new Accountant("Accountant");
        director.print();
        worker.print();
        accountant.print();
    }
}
