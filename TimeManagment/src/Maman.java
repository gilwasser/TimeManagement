
// works for

public class Maman extends Mission{
    String type = "mmn";
    private int mmnNumber;

    ///////////////////////////  Constructors  //////////////////////////////////////////////////////

    public Maman(String name, int mmnNumber){
        super("Mmn "+name + " " + mmnNumber);
        this.mmnNumber = mmnNumber;
        time = 4;
    }

    public Maman(){

    }

    ///////////////////////////  Getters  //////////////////////////////////////////////////////

    public int getMmnNumber() {
        return mmnNumber;
    }

    public String getType() {
        return type;
    }

    public Mission create(String name, int number){
        Mission mission = new Maman(name, number);
        return mission;
    }
}
