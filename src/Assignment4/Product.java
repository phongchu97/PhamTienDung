package Assignment4;

public class Product {
    double ID;
    String name;
    double price;
    int amount;

    public boolean checkAmount(int orderAmount){
        if(this.amount < orderAmount){
            return false;
        }
        return true;
    }

    public Product(double ID, String name, double price, int amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
