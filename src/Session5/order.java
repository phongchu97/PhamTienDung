package Session5;

import java.util.ArrayList;

public class order {
    Integer id;
    Double totalPrice;
    ArrayList<String> orderList = new ArrayList();
    public void addToCart(String name, Integer amount, Double price){
        this.orderList.add(name);
        this.totalPrice += amount*price;
    }
}
