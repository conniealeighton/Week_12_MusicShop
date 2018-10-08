public class Oboe extends Instruments implements IPlay{

//    public enum OboeType{
//        WOOD(1),
//        SYNTHETIC(2)
//    }

//    OboeType type;

    private String type;

    public Oboe (String name, String brand, String type){
        super(name, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String play(){
        return "toot toot";
    }
}
