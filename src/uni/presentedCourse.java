package uni;

import java.util.ArrayList;

public class presentedCourse {
    public int id;
    public int courseID;
    public int professorID;
    public int maxCapacity;
    public static ArrayList<presentedCourse> presentedCoursesList = new ArrayList<>();
    public ArrayList<Integer> studentIds;

    public presentedCourse(int courseID, int professorID, int maxCapacity){
        this.courseID = courseID;
        this.professorID = professorID;
        this.maxCapacity = maxCapacity;
        this.studentIds = new ArrayList<>(maxCapacity);
        this.id = presentedCoursesList.size();
        presentedCoursesList.add(this);
    }
    public static presentedCourse findByID(int id) {
        for (presentedCourse PresentedCourse : presentedCoursesList) {
            if (PresentedCourse.id == id) {
                return PresentedCourse;
            }
        }
        return null;
    }
    public void addStudent(int studentID){
        if (studentIds.size() < this.maxCapacity){
            studentIds.add(studentID);
        } else {
            System.out.print("Cannot Add a new Stuedent! The Capacity is Full.");
        }
    }
}
