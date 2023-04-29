public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    String getCustomerName() {
        return getCustomer().getName();
    }

    double getAmountAfterDiscount() {
        return getAmount() - getAmount() * customer.getDiscount()/100;
    }
}
