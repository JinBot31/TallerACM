package ACM.java.Ejercicio2.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceProvider {
    private final ObjectProvider<ShoppingCart> cartProvider;

    public ProductServiceProvider(ObjectProvider<ShoppingCart> cartProvider) {
        this.cartProvider = cartProvider;
    }

    public void addToCart(String user, String product) {
        ShoppingCart cart = cartProvider.getObject(); // NUEVA instancia prototype
        cart.addProduct(user + ":" + product);
        System.out.println("[Provider] Usuario " + user + " añadió '" + product + "' -> cartId=" + cart.identity() + " contents=" + cart.getProducts());
    }
}

