public class DrumSticks implements ISell {

        private String name;
        private String type;
        private double price;
        private double sell;

    public DrumSticks(String name, String type, double price, double sell){
        this.name = name;
        this.type = type;
        this.price = price;
        this.sell = sell;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getSell() {
        return sell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public double markUp(){
        return (sell - price);
    }
}
