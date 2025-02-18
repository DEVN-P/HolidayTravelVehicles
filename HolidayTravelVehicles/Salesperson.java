import java.util.ArrayList;

public class Salesperson {
    private ArrayList<Invoice> invoices;

    Salesperson() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }
}