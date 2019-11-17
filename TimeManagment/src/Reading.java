public class Reading extends Mission {
    String type = "read";
    int numOfPages;

    public Reading(){

    }

    public Reading(String name, int numOfPages){
        super("Read " + name);
        this.numOfPages = numOfPages;
        time = (numOfPages*5)/60+1;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getType() {
        return type;
    }

    public Mission create(String name, int number){
        Mission mission = new Reading(name, number);
        return mission;
    }

}
