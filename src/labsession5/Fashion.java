package labsession5;

public class Fashion extends Product {
    float size;
    String color;
    String brand;

    Fashion(){
        System.out.println("bạn vừa tạo ra 1 fashion, vui lòng nhập thông tin");
    }

    public Fashion(float size, String color, String brand) {
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public Fashion(float size, String color, String brand, int ID, String name, int Price, int qty) {
        super(ID, name, Price, qty);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public Fashion(float size, String color, String brand, String name) {
        super(name);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public Fashion(float size, String color, String brand, String name, int Price, int qty) {
        super(name, Price, qty);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    void giatLa(){
        System.out.println("giặt là thương hiệu" + this.brand);
    }
    void lamKho(){
        System.out.println("làm khô thương hiệu" + this.brand);
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
