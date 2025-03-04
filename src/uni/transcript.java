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
        presentedCourse PresentedCourse = presentedCourse.findByID(presentedCourseID);
        if (PresentedCourse != null) {
            transcript.put(presentedCourseID, grade);
        }

    }

    public void printTranscript(){
        person Person = person.findByID(studentID);

        if (Person != null) {
            System.out.println( Person.name);
        } else {
            System.out.println( studentID );
            return;
        }

        for (Integer courseID : transcript.keySet()){
         //   System.out.println(courseID);
            presentedCourse currentCourse2 = presentedCourse.findByID(courseID);
            course currentCourse = course.findByID(courseID);
            if (currentCourse != null) {
                System.out.println( currentCourse.title + transcript.get(currentCourse2.id));
            } else {
                System.out.println( courseID );
            }

        }
    }
    public double getGPA() {
        double totalGradePoints = 0;
        int totalUnits = 0;

        for (Integer courseID : transcript.keySet()) {
            course currentCourse = course.findByID(courseID);
            if (currentCourse != null){
                int units = currentCourse.units;
                totalGradePoints += transcript.get(courseID) * units;
                totalUnits += units;
            }
        }

        return totalGradePoints / totalUnits;
    }
}
