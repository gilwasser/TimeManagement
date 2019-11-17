public class Obligations extends Mission{
    protected String type = "obligations";
    private int day;

    Obligations (String name , int time, int day){
        super(name, time);
        this.day =day;
    }

    public int getDay() {
        return day;
    }


}
