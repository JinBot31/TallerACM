package ACM.java.Ejercicio2.services;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ShoppingCart cart; // prototype inyectado una sola vez al crear el singleton

    public ProductService(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addToCart(String user, String product) {
        cart.addProduct(user + ":" + product);
        System.out.println("[Wrong] Usuario " + user + " añadió '" + product + "' -> cartId=" + cart.identity() + " contents=" + cart.getProducts());
    }

    public ShoppingCart getCart() {
        return cart;
    }
}


