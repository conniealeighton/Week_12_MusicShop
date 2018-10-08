import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("guitar", "Taylor", "electric");
    }

    @Test
    public void hasName() {
        assertEquals("guitar", guitar.getName());
    }

    @Test
    public void hasBrand() {
    assertEquals("Taylor", guitar.getBrand());
    }

    @Test
    public void hasType() {
    assertEquals("electric", guitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("strum strum strum", guitar.play());
    }
}