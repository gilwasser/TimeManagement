public class Watch extends Mission {
    String type = "watch";
    private int numOfLecture;

    ///////////////////////////  Constructors  //////////////////////////////////////////////////////
    public Watch(){

    }

    public Watch(String name,int numOfLecture){

        super("Watch " + name + " " + numOfLecture);
        this.numOfLecture = numOfLecture;
        time = watchSubject(name);

    }

    private int watchSubject(String subject){

        if(subject.equalsIgnoreCase("Algorithms")){
            return 2;
        } else if (subject.equalsIgnoreCase("Logic")){
            return 2;
        } else {
            return 3;
        }

    }
    /////////////////////////////////  Getters  //////////////////////////////////////////////////////

    public int getNumOfLecture() {
        return numOfLecture;
    }

    public String getType() {
        return type;
    }

    public Mission create(String name, int number){
        Mission mission = new Watch(name, number);
        return mission;
    }
}
