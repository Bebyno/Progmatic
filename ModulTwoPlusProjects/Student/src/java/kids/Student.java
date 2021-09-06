package kids;

import grade.Grade;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Grade> grade;
    private double avarage = 0;

   public Student(String name, List<Grade> grade){
        this.name = name;
        this.grade = grade;

       for (int i = 0; i < grade.size(); i++) {
         this.avarage += grade.get(i).ordinal()+1;
       }

    }


    public String getName() {
        return name;
    }

    public List<Grade> getGrade() {
        return grade;
    }
    public List<Integer> getGradeAsNumber() {
       List<Integer> number = new ArrayList<>();
        for (int i = 0; i < grade.size(); i++) {
            number.add(grade.get(i).ordinal()+1);

        }
        return number;
    }


    public double getAvarage() {
        return avarage;
    }
}