package labsession5;

public class main {
    public static void main(String[] args) {
        Ao aophong1 = new Ao(30,"đỏ","luxury","hoa hồng",500, 5);
        Nhan nhanvang = new Nhan(100,"vàng","nhẫn rồng vàng ", 9989,5);

        order bill101 = new order();
        bill101.addProduct(aophong1, 2);
        bill101.addProduct(nhanvang, 3);
        bill101.printBill();
        bill101.printStoreage();
        bill101.addProduct(aophong1, 2);
        bill101.addProduct(nhanvang, 2);
        bill101.printBill();
        bill101.printStoreage();
    }
}
