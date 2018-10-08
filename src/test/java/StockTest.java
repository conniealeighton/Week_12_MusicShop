import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StockTest {

    Stock stock;
    ArrayList<ISell> stockItems;
    DrumSticks drumsticks;
    DrumSticks drumsticks2;


    @Before
    public void setUp() throws Exception {
        drumsticks = new DrumSticks("drum sticks", "wood", 5, 30);
        drumsticks2 = new DrumSticks("cheap drum sticks", "plastic", 3, 10);
        stockItems = new ArrayList<>();
        stock = new Stock(stockItems);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, stock.getStock().size());
    }

    @Test
    public void canAddStock() {
        stock.addStock(drumsticks);
        assertEquals(1, stock.getStock().size());
    }

    @Test
    public void canRemoveStock() {
        stock.addStock(drumsticks);
        stock.addStock(drumsticks2);
        stock.removeStockByElement(drumsticks);
        assertEquals(1, stock.getStock().size());
    }
}