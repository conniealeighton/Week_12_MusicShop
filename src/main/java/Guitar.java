public class Guitar extends Instruments implements IPlay{


//    Unsure how to add enum here
//    public enum GuitarType{
//    ELECTRIC(1),
//    ACOUSTIC(2);

//    int GuitarType;

    public String type;

    public Guitar (String name, String brand, String type){
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
        return "strum strum strum";
    }
}


