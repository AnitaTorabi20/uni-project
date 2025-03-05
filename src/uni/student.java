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
        this.id = idCounter++;

        setStudentCode();
        studentsList.add(this);
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
        int count = 0;
        for (student s : studentsList){
            if (s.majorID == this.majorID && s.enterenceYear == this.enterenceYear){
                count++;
            }
        }
        this.studentID = enterenceYear + "" + majorID + "" + String.format("%03d", count);
     }
}
