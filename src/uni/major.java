package uni;

import base.person;

import java.util.ArrayList;

public class major {
    public int id;
    public String name;
    public final int capacity;
    public  int numbersOfStudents = 0;
    public static ArrayList<major> majorList = new ArrayList<>();
    private static int nextID = 1;


    public major(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        majorList.add(this);
        this.id = majorList.size();
    }

    public static major findByID(int id){
        for (major Major : majorList){
            if (Major.id == id){
                return Major;
            }
        }
        return null;
    }

    public void addStudent(){
         numbersOfStudents++;
         if (numbersOfStudents > this.capacity){
             System.out.print("Cannot Add a new Stuedent! The Capacity is Full.");
         }
    }
}