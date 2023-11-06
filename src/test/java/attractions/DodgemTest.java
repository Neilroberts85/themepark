package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        child = new Visitor(11,1.1, 0.0);
        adult = new Visitor(88,1.8, 12.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.1);
    }

    @Test
    public void hasPriceFor() {
        assertEquals(4.50, dodgems.priceFor(adult), 0.1);
        assertEquals(2.25, dodgems.priceFor(child), 0.1);
    }
}
