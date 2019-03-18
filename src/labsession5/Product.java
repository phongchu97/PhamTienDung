package labsession5;

public class Product {
    int ID;
    String name;
    int Price;
    int qty;
    int SLsanPhamDaMua;
    public Product (){
        System.out.println("bạn vừa tạo ra 1 sản phẩm, vui lòng nhập thông tin sản phẩm");
    }
    public Product(int ID, String name, int Price, int qty) {
        this.ID = ID;
        this.name = name;
        this.Price = Price;
        this.qty = qty;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int Price, int qty) {
        this.name = name;
        this.Price = Price;
        this.qty = qty;
        this.ID = (int)(Math.random()*8999+1000);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
