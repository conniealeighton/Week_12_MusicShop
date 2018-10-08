import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OboeTest {

    Oboe oboe;

    @Before
    public void setUp() throws Exception {
        oboe = new Oboe("oboe", "brand", "woodwind");
    }

    @Test
    public void hasName() {
        assertEquals("oboe", oboe.getName());
    }

    @Test
    public void hasBrand() {
        assertEquals("brand", oboe.getBrand());
    }

    @Test
    public void hasType() {
        assertEquals("woodwind", oboe.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("toot toot", oboe.play());
    }
}