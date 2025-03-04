package uni;

import java.util.ArrayList;

public class student {
    public int id;
    public int personID;
    public final int enterenceYear;
    public int majorID;
    public String studentID;
    public static ArrayList<student> studentsList = new ArrayList<>();
    public static int idCounter = 1;


    public student(int personID, int entranceYear, int majorID){
        this.personID = personID;
        this.enterenceYear = entranceYear;
        this.majorID = majorID;
        setStudentCode();
        studentsList.add(this);
        id = studentsList.size();
    }

    public static student findByID(int id){
        for (student Student : studentsList){
            if (Student.personID == id){
                return Student;
            }
        }
        return null;
    }

     public void setStudentCode(){
        this.studentID = enterenceYear + "" + majorID + "" + id;
     }
}
