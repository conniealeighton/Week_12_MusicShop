import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new DrumSticks("drum sticks", "wood", 5, 30);
    }

    @Test
    public void hasName() {
        assertEquals("drum sticks", drumsticks.getName());
    }

    @Test
    public void hasType() {
        assertEquals("wood", drumsticks.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(5, drumsticks.getPrice(), 0);
    }

    @Test
    public void hasSell() {
        assertEquals(30, drumsticks.getSell(), 0);
    }

    @Test
    public void hasMarkUp() {
        assertEquals(25, drumsticks.markUp(), 0);
    }
}