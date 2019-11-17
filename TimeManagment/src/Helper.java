
//  Process the statements and build missions

public class Helper {
    private Mission[] missions;

    public Helper(Mission[] missions){
        this.missions = missions;
    }

    public Mission buildMission(String statement){

        Mission miss = new Mission();
        String[] parsed = statement.split(" ");

        String type = parsed[0]; //first word
        String name = parsed[1]; // second word

        int number = Integer.parseInt(parsed[2]); //

        for (Mission mission:missions){
            if(type.equalsIgnoreCase(mission.getType())) {
                miss = mission;
                break;
            }
        }

        return miss.create(name,number);

    }

    public Obligations buildObligation(String statement){

        Mission miss = new Mission();
        String[] parsed = statement.split(" ");

        String name = parsed[0]; //first word

        int time = Integer.parseInt(parsed[1]);
        int day = Integer.parseInt(parsed[2]);

        return new Obligations(name, time ,day);

    }

}
