public class Customer extends Person {
    private int customerID;

    Customer(String name, String phoneNumber, String address, int customerID) {
        super(name, phoneNumber, address);
        this.customerID = customerID;
    }
}