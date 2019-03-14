package Assignment4;

public class Main {
    public static void main(String[] args){
        Product apple = new Product(1, "apple" , 10000, 5);
        Product bannana = new Product(2, "bannana" , 15000, 2);
        Product pineapple = new Product(3, "pineapple" , 5000, 0);
        Order customerOrder = new Order();
        customerOrder.addToCart(3, apple);
        customerOrder.addToCart(2, bannana);
        customerOrder.addToCart(1, pineapple);
        for(String item: customerOrder.listProduct){
            System.out.println(item);
        }
    }
}
