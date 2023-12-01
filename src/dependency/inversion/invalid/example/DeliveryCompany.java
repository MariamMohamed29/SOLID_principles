package dependency.inversion.invalid.example;

public class DeliveryCompany {
    public void sendProduct(Product product) {
        //in the following line we will make dependency between DeliveryCompany and DeliveryDriver class
        DeliveryDriver driver = new DeliveryDriver();
        driver.deliverProduct(product);
    }
}
