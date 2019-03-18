package labsession5;

public class Jewelry extends Product {
    float Jewelryweight;
    String Jewelrytype;


    Jewelry(){
        System.out.println("bạn mới tạo Jewelry, vui lòng nhập thông tin");
    }

    public Jewelry(float Jewelryweight, String Jewelrytype, int ID, String name, int Price, int qty) {
        super(ID, name, Price, qty);
        this.Jewelryweight = Jewelryweight;
        this.Jewelrytype = Jewelrytype;
    }

    public Jewelry(float Jewelryweight, String Jewelrytype, String name) {
        super(name);
        this.Jewelryweight = Jewelryweight;
        this.Jewelrytype = Jewelrytype;
    }

    public Jewelry(float Jewelryweight, String Jewelrytype, String name, int Price, int qty) {
        super(name, Price, qty);
        this.Jewelryweight = Jewelryweight;
        this.Jewelrytype = Jewelrytype;
    }


    void LamMoi(){
        System.out.println("làm mới Jewelry" + this.name);
    }

    public float getJewelryweight() {
        return Jewelryweight;
    }

    public void setJewelryweight(float Jewelryweight) {
        this.Jewelryweight = Jewelryweight;
    }

    public String getJewelrytype() {
        return Jewelrytype;
    }

    public void setJewelrytype(String Jewelrytype) {
        this.Jewelrytype = Jewelrytype;
    }

}
