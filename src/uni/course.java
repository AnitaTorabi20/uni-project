package uni;

import java.util.ArrayList;

public class course {
    public int id;
    public String title;
    public int units;
    public static ArrayList<course> courseList = new ArrayList<>();

    public course(String title, int units){
        this.title = title;
        this.units = units;
        courseList.add(this);
        this.id = courseList.size();

    }
    public static course findByID(int id) {
        for (course Course : courseList) {
            if (Course.id == id) {
                return Course;
            }
        }
        return null;
    }
}
