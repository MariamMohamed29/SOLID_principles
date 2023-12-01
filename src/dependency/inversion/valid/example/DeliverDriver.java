package dependency.inversion.valid.example;

import dependency.inversion.invalid.example.Product;

public class DeliverDriver implements DeliverService {
    @Override
    public void deliverProduct(Product product) {
        //deliver product...
    }
}
