package uni;


import base.person;

import java.util.HashMap;

public class transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public transcript(int studentID){
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }
    public void setGrade(int presentedCourseID, double grade){
        if (presentedCourse.findByID(studentID) != null){
            transcript.put(presentedCourseID, grade);
        }

    }

    public void printTranscript(){
        person person1 = person.findByID(studentID);

        System.out.println( person1.name );

        for (Integer courseID : transcript.keySet()){
            System.out.println(transcript.get(courseID));

        }
    }
    public double getGPA() {
        double totalGradePoints = 0;
        int totalUnits = 0;

        for (Integer courseID : transcript.keySet()) {
            int units = 3;
            totalGradePoints += transcript.get(courseID) * units;
            totalUnits += units;
        }

        return totalGradePoints / totalUnits;
    }
}
