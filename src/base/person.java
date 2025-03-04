package base;
import java.util.ArrayList;

public class person {
    public int id;
    public String name;
    public String nationalID;
    public static ArrayList<person> personList = new ArrayList<>();
    public static int nextID = 1;

    public person(String name, String nationalID){
        this.id = nextID++;
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
    }

    public static person findByID(int id){
        for (person Person : personList){
            if (Person.id == id){
                return Person;
            }
        }
        return null;
    }
}
