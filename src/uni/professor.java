package uni;

import java.util.ArrayList;

public class professor {
    public int id;
    public int personID;
    public int majorID;
    public static ArrayList<professor> professorsList;

    public professor(int personID, int majorID){
        this.personID = personID;
        this.majorID = majorID;
    }
    public static professor findByID(int id){
        for (professor Professor : professorsList){
            if (Professor.id == id){
                return Professor;
            }
        }
        return null;
    }
}
