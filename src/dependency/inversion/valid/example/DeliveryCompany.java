package dependency.inversion.valid.example;

import dependency.inversion.invalid.example.Product;

public class DeliveryCompany {
    //by the following code two classes won't depend on each other but DeliveryCompany class depend on the interface
    private DeliverService deliverService;

    public DeliveryCompany(DeliverService deliverService) {
        this.deliverService = deliverService;
    }
    public void sendProduct(Product product){
        this.deliverService.deliverProduct(product);
    }
}
