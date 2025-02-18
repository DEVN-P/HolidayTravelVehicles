public class Invoice {
    private String invoiceNumber;
    private Vehicle vehicle;
    private Customer customer;
    private DealerOptions dealerOptions;

    // Constructor
    public Invoice(String invoiceNumber, Vehicle vehicle, Customer customer, DealerOptions dealerOptions) {
        this.invoiceNumber = invoiceNumber;
        this.vehicle = vehicle;
        this.customer = customer;
        this.dealerOptions = dealerOptions;
    }

    // Getters and Setters
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void getDealerOption() {
        System.out.println("Option Code: " + dealerOptions.getOptionCode());
        System.out.println("Description: " + dealerOptions.getDescription());
        System.out.println("Option Price: " + dealerOptions.getOptionPrice());
    }

    public void setDealerOptions(DealerOptions dealerOptions) {
        this.dealerOptions = dealerOptions;
    }   
}