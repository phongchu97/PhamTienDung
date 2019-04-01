package Assignment9;

public class Customer {
    Integer customerID;
    String customerName;
    String customerType;
    Boolean foreign;

    public Customer(Integer customerID, String customerName, String customerType, Boolean foreign) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerType = customerType;
        this.foreign = foreign;
    }
}
