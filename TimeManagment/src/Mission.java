public class Mission implements Comparable<Mission>{

    protected String type = "mission";
    protected String name;
    protected int time;

/////////////////////////////////  Getters  //////////////////////////////////////////////////////

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    ///////////////////////////  Constructors  //////////////////////////////////////////////////////

    public Mission(){

    }

    public Mission(String name) {

        this.name = name;

    }

    public Mission(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Mission create(String name,int number){
        Mission mission = new Mission(name,number);
        return mission;
    }

    @Override
    public int compareTo(Mission mission) {
        int result = ((Integer)mission.getTime()).compareTo(this.time);
        return (result == 0)? 1 : result;

    }
}