package ACM.java.Taller1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service("orderService")
public class OrderService {

    //@Qualifier("premiumDiscount)
    //declaración explícita con nombre erróneo
    //@Qualifier("premiumDiscountService")
    //declaración explícita con nombre correcto
    @Autowired (required = false)
    private DiscountService discountService;

    public double getFinalPrice(double amount){
        if (discountService == null) {
            System.out.println("No hay servicio de descuento disponible. Precio sin descuento.");
            return amount;
        }
        return discountService.applyDiscount(amount);
    }

    public String whichDiscount(){
        return discountService.toString();
    }
}
