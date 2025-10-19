package ACM.java.Taller1.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("premiumDiscountService")
public class PremiumDiscountService implements DiscountService{

    @Override
    public double applyDiscount(double amount){
        return amount * 0.75;
    }

    @Override
    public String toString(){
        return "premium discount service";
    }
}
