package ACM.java.Ejercicio2;

import ACM.java.Ejercicio2.services.ProductService;
import ACM.java.Ejercicio2.services.ProductServiceContext;
import ACM.java.Ejercicio2.services.ProductServiceProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final ProductService objService;
    private final ProductServiceProvider provider;
    private final ProductServiceContext ctxService;

    public AppRunner(ProductService objService,
                     ProductServiceProvider provider,
                     ProductServiceContext ctxService) {
        this.objService = objService;
        this.provider = provider;
        this.ctxService = ctxService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- Test 1: inyección directa (comportamiento inesperado) ---");
        objService.addToCart("alice", "Manzana");
        objService.addToCart("bob", "Platano");
        System.out.println("Carrito inyectado en singleton (wrong) -> id=" + objService.getCart().identity() +
                " contenido=" + objService.getCart().getProducts());

        System.out.println("\n--- Test 2: ObjectProvider ---");
        provider.addToCart("alice", "Manzana");
        provider.addToCart("bob", "Platano");

        System.out.println("\n--- Test 3: ApplicationContext.getBean ---");
        ctxService.addToCart("alice", "Manzana");
        ctxService.addToCart("bob", "Platano");

    }
}