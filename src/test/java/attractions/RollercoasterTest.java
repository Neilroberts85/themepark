package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        child = new Visitor(13,1.5, 0.0);
        adult = new Visitor(88,2.1, 12.0);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.1);
    }
    @Test
    public void canRide(){
        assertTrue(rollerCoaster.isAllowedTo(child));
    }

    @Test
    public void hasPriceFor(){
        assertEquals(16.80, rollerCoaster.priceFor(adult), 0.1);
        assertEquals(8.40, rollerCoaster.priceFor(child), 0.1);
    }
}
