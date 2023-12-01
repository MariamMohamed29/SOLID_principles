package single.responsibility.principle.invalid.example;

//this class violates the single responsibility principle
public class Customer {
    private String name;
    //getter and setter methods...

    //this is a responsibility
    public void storeCustomer(String customerName) {
        //store customer into a database...
    }

    //this is another responsibility
    public void generateCustomerReport(String customerName) {
        //generate a report...
    }
}
