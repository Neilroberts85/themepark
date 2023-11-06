import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Visitor adult;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Small Dipper", 10);
        adult = new Visitor(20,1.8, 20.0);
    }

    @Test
    public void hasIReviewedList(){
        themePark.addObjectToIReviewed(rollerCoaster);
        assertTrue(themePark.getAllReviewed().contains(rollerCoaster));
    }

    @Test
    public void canVisit(){
        themePark.visit(adult, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount() );
        assertTrue(adult.getVisitedAttractions().contains(rollerCoaster));
    }
}