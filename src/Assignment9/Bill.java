package Assignment9;

public class Bill extends Customer {
    Integer usedAmount;

    public Integer totalPrice(Integer usedAmount, Boolean foreign) {
       if(foreign) {
            if(usedAmount <= 2000) {
                if(usedAmount < 50) {
                    return usedAmount*1000;
                } else if(usedAmount < 100) {
                    return usedAmount*1200;
                } else if(usedAmount <= 200) {
                    return usedAmount*1500;
                } else {
                    return usedAmount*2000;
                }
            } else {
                return (usedAmount*2000 + (usedAmount - 2000)*2000);
            }
       } else {
           if(usedAmount < 50) {
               return usedAmount*1000;
           } else if(usedAmount < 100) {
               return usedAmount*1200;
           } else if(usedAmount <= 200) {
               return usedAmount*1500;
           } else {
               return usedAmount*2000;
           }
       }
    }

    public Bill(Integer customerID, String customerName, String customerType, Boolean foreign, Integer usedAmount) {
        super(customerID, customerName, customerType, foreign);
        this.usedAmount = usedAmount;
    }

    public static void main(String[] args) {
        Bill bill2 = new Bill(1,"Pham Tien Dung","Sinh Hoat", false, 300);

        Integer price = bill2.totalPrice(1000, false);
        System.out.println(bill2.customerName);
        System.out.println(price);
    }
}
