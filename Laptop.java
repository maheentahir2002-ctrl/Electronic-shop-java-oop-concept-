public class Laptop extends Product {

    private String processor;

    public Laptop(int id, String name, double price, String processor) {
        super(id, name, price);
        this.processor = processor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Processor: " + processor);
        System.out.println("----------------------------");
    }
}