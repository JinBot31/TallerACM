package ACM.java.Taller1;

import ACM.java.Taller1.Service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final OrderService orderService;

    public AppRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) throws Exception {
        double base = 100.0;
        System.out.println("Precio final: " + orderService.getFinalPrice(base));
        System.out.println("Servicio usado: " + orderService.whichDiscount());
    }
}