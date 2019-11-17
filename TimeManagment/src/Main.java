import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader= Files.newBufferedReader(Paths.get("Todo.txt"));
        BufferedReader obligations= Files.newBufferedReader(Paths.get("Obligations.txt"));
//        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String line;

        Mission missions[]={
                new Reading(),
                new Watch(),
                new Maman()
        };

        TreeSet<Mission> ordered = new TreeSet<>();

        Collection<Obligations> obligs = new ArrayList<>();
        Helper helper = new Helper(missions);
        Weekly week = new Weekly(7,9);


        while(true){
            try {
                if ((line = reader.readLine()) == null || line.isEmpty()) break;
                ordered.add(helper.buildMission(line));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        while(true){
            try {
                if ((line = obligations.readLine()) == null || line.isEmpty()) break;
                obligs.add(helper.buildObligation(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(Obligations ob: obligs){
            week.addToDay(ob);
        }

        for(Mission mission: ordered){
            week.addToSchedule(mission);
        }
        week.display();

    }
}
