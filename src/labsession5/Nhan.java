package labsession5;

public class Nhan extends Jewelry {
    Nhan(){
        System.out.println("bạn vừa tạo ra 1 sản phẩm nhẫn, vui lòng nhập thông tin");
    }

    public Nhan(float Jewelryweight, String Jewelrytype, int ID, String name, int Price, int qty) {
        super(Jewelryweight, Jewelrytype, ID, name, Price, qty);
    }

    public Nhan(float Jewelryweight, String Jewelrytype, String name) {
        super(Jewelryweight, Jewelrytype, name);
    }

    public Nhan(float Jewelryweight, String Jewelrytype, String name, int Price, int qty) {
        super(Jewelryweight, Jewelrytype, name, Price, qty);
    }

}
