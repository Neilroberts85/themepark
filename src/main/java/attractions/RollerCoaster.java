package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 2.00){
            return defaultPrice()*2;
        }
        return defaultPrice();
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 1.45 && visitor.getAge() > 12;
    }
}
