import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> allReviewed;

    public ThemePark() {
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }
    public void addObjectToIReviewed(IReviewed iReviewed){
        allReviewed.add(iReviewed);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

}
