package ACM.java.Taller1.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


//@Service("basicDiscountService")
public class BasicDiscountService implements DiscountService{

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.50;
    }

    @Override
    public String toString(){
        return "Basic discount service";
    }
}
