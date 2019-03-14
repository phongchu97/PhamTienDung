package Assignment4;
import java.util.ArrayList;

public class Order {
    double ID;
    double totalPrice;
    ArrayList<String> listProduct = new ArrayList();

    public void addToCart(int amount, Product product){
        if(product.checkAmount(amount)) {
            listProduct.add(product.name);
            System.out.println("You added" + product.name + "to your shopping cart");
        } else {
            System.out.println(product.name + " are sold out");
        }
    }
}
