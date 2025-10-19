package ACM.java.Ejercicio2.services;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceContext {
    private final ApplicationContext ctx;

    public ProductServiceContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public void addToCart(String user, String product) {
        ShoppingCart cart = ctx.getBean(ShoppingCart.class); // pide una instancia nueva
        cart.addProduct(user + ":" + product);
        System.out.println("[AppContext] Usuario " + user + " añadió '" + product + "' -> cartId=" + cart.identity() + " contents=" + cart.getProducts());
    }
}