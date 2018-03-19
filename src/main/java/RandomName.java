import java.util.ArrayList;
import java.util.Collections;

public class RandomName {

    private ArrayList<String> names;

    public RandomName(ArrayList<String> names) {
        this.names = names;
        this.names.add("Emma");
        this.names.add("Derek");
        this.names.add("Mark");
        this.names.add("Darrell");
        this.names.add("Rosemary");
        this.names.add("Will");
        this.names.add("Herbie");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public int getNumberOfNames() {
        return names.size();
    }

    public String returnRandomName() {
        Collections.shuffle(names);
        return names.get(0);
    };

    public String returnTwoNames() {
        Collections.shuffle(names);
        return names.get(0) + " & " + names.get(1);
    };



}



