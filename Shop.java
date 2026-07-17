import java.util.ArrayList;

public class Shop {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {

        if(products.isEmpty()) {
            System.out.println("No Products Available.");
            return;
        }

        for(Product p : products) {
            p.display();
        }
    }

    public Product searchProduct(int id) {

        for(Product p : products) {
            if(p.getId() == id)
                return p;
        }

        return null;
    }

    public void buyProduct(int id) {

        Product p = searchProduct(id);

        if(p == null) {
            System.out.println("Product Not Found.");
            return;
        }

        System.out.println("\nProduct Purchased Successfully!");
        p.display();
    }
}