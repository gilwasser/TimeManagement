
//Weekly schedule management

public class Weekly {
    public Mission[][] week;
    int days;
    int hoursDay;

    public Weekly(int days, int hoursDay) {
        this.days= days;
        this.hoursDay = hoursDay;
        week = new Mission[hoursDay][days];
        initWeek();
    }

    public void initWeek(){
        for (int i = 0; i < days; i++){
            for (int j = 0; j < hoursDay; j++){
                week[j][i] = null;
            }
        }
    }

    public void addToSchedule(Mission mission){
        for( int j = 0; j + mission.getTime() <= hoursDay ; j++){
            for(int i = (days -1) ; i >= 0; i--){
                if(week[j][i] == null) {
                    fill(mission, j, i);
                    return;
                }

            }
        }
        System.out.println("\nfailed " + mission.getName());
        return;
    }

    public void addToDay(Obligations ob){
        int time = ob.getTime();
        int day = ob.getDay();
        for(int i = 0 ; i+ time <= hoursDay ; i++){
            if(week[i][days - day] == null) {
                fill(ob, i, days -day);
                return;
            }
        }
        return;
    }

    public void fill(Mission mission, int hour, int day){
        for(int c = 0; c < mission.getTime(); c++)
            week[hour+c][day]= mission;
    }

    public void display(){

        System.out.println("\n");
        for(int j = 7; j > 0; j--){
            System.out.print(String.format("|  %-20d|",j));
        }
        System.out.println();
        for(int i = 0 ; i < 168; i++) {
            System.out.print("=");
        }
        for(int i = 0; i < hoursDay; i++){

            System.out.println();

            for (int j = 0 ; j < days; j++){
                if(week[i][j] != null){
                    String s = String.format("|  %-20s|",week[i][j].getName());
                    System.out.print(s);
                }
                else
                    System.out.print(String.format("|  %-20s|"," "));
            }
        }

    }
}

