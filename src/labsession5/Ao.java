package labsession5;

public class Ao extends Fashion{
    Ao(){
        System.out.println("bạn vừa tạo ra 1 sản phẩm áo, vui lòng nhập thông tin");
    }

    public Ao(float size, String color, String brand) {
        super(size, color, brand);
    }

    public Ao(float size, String color, String brand, int ID, String name, int Price, int qty) {
        super(size, color, brand, ID, name, Price, qty);
    }

    public Ao(float size, String color, String brand, String name) {
        super(size, color, brand, name);
    }

    public Ao(float size, String color, String brand, String name, int Price, int qty) {
        super(size, color, brand, name, Price, qty);
    }
}
