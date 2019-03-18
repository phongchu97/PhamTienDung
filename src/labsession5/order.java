package labsession5;

import java.util.ArrayList;

public class order {
    String ID;
    float TotalBill;
    ArrayList<Product> danhSachSP = new ArrayList<>();

    order(){
        this.ID = (int)(Math.random()*9) +"00" + (int)(Math.random()*999);
        System.out.println("bạn vừa tạo order ID : " + this.ID);
    }
    void addProduct(Product SP, Integer qty){
        if (SP.qty > 0 ){
            SP.SLsanPhamDaMua =qty;
            SP.qty -= qty;
            danhSachSP.add(SP);
            this.TotalBill += (SP.Price*qty);
        }
        else {
            System.out.println("sản phẩm đã hết hàng !");
        }
    }
    void printBill(){
        System.out.println("\n bill:" );
        for(Product tungSP:this.danhSachSP){
            System.out.println( tungSP.name+ " ,id: "+ tungSP.ID);
            System.out.println("giá : "+ tungSP.Price + "      số SP lượng mua: " + tungSP.SLsanPhamDaMua);
        }
        System.out.println("tổng tiền : " + this.TotalBill);
    }

    void printStoreage(){
        System.out.println("\n stroge:" );
        for(Product tungSP:this.danhSachSP){
            System.out.println(tungSP.name+ " ,id: "+ tungSP.ID);
            System.out.println("giá : "+ tungSP.Price + "    số SP còn lại:   " + tungSP.qty);
        }
    }
}
