import uni.*;
import base.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        major math = new major("Math", 40);
        major computerScience = new major("Computer Science",50);

        person person1 = new person("Nora", "123");
        person person2 = new person("Melike", "456");
        person person3 = new person("Fateme", "789");
        person person4 = new person("Anita", "1011");
        person person5 = new person("Eli","1213");

        student student1 = new student(person1.id, 403, math.id);
        student student2 = new student(person2.id, 401, math.id);
        student student3 = new student(person3.id, 402, computerScience.id);

        System.out.println(person1.name + " " + student1.studentID);
        System.out.println(person2.name + " " + student2.studentID);
        System.out.println(person3.name + " " + student3.studentID);


        professor professor1 = new professor(person4.id, math.id);
        professor professor2 = new professor(person5.id, computerScience.id);

        System.out.println(person4.name + " " + person4.id);
        System.out.println(person5.name + " " + person5.id);

        course Math = new course("math",3);
        course AP = new course("AP",4);
        course BP = new course("BP",4);


        presentedCourse course1 = new presentedCourse(1, professor1.id, 30);
        presentedCourse course2 = new presentedCourse(2, 1, 25);
        presentedCourse course3 = new presentedCourse(3, 2, 20);

        course1.addStudent(student1.id);
        course1.addStudent(student2.id);
        course2.addStudent(student1.id);
        course2.addStudent(student2.id);
        course2.addStudent(student3.id);
        course3.addStudent(student3.id);


        transcript transcript1 = new transcript(student1.id);
        transcript transcript2 = new transcript(student2.id);
        transcript transcript3 = new transcript(student3.id);

        transcript1.setGrade(course1.courseID, 18.5);
        transcript1.setGrade(course2.courseID, 16.0);

        transcript2.setGrade(course1.courseID, 17.0);
        transcript2.setGrade(course2.courseID, 19.0);

        transcript3.setGrade(course2.courseID, 15.5);
        transcript3.setGrade(course3.courseID, 20.0);


        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        System.out.println("معدل‌ها:");
        System.out.println("معدل دانشجوی 1: " + transcript1.getGPA());
        System.out.println("معدل دانشجوی 2: " + transcript2.getGPA());
        System.out.println("معدل دانشجوی 3: " + transcript3.getGPA());
    }
}