import java.util.ArrayList;

public class Stock{

    private ArrayList<ISell> stock;

    public Stock(ArrayList<ISell> stock) {
        this.stock = stock;
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell newStock) {
        this.stock.add(newStock);
    }

    public void removeStockByElement(ISell stockToRemove){
        this.stock.remove(stockToRemove);
    }


}
