public class Mobile extends Product {

    private int camera;

    public Mobile(int id, String name, double price, int camera) {
        super(id, name, price);
        this.camera = camera;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Camera: " + camera + " MP");
        System.out.println("----------------------------");
    }
}