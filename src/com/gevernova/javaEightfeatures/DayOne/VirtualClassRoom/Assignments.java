package com.gevernova.javaEightfeatures.DayOne.VirtualClassRoom;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Assignments {

    String title;
    LocalDate deadline;
    Map<Student,String> Normalsubmissions = new HashMap<>();
    Map<Student,String> Latesubmissions = new HashMap<>();
    Map<Student,Integer> grades = new HashMap<>();

    public Assignments(String title, LocalDate deadline){
        this.deadline = deadline;
        this.title = title;
    }

    public void submit(Student Student, String Work, LocalDate SubmissionDate){
        if(SubmissionDate.isAfter(deadline)){
            System.out.println("Late Submission By " + Student.name);
            Latesubmissions.put(Student, Work);
            return;
        }
        Normalsubmissions.put(Student, Work);
    }

    public void DoGradingForOnTime(){
        for(Student s : Normalsubmissions.keySet()){
            Grading(s, 10);
        }
    }

    public void DoGradingForLate(){
        for(Student s : Latesubmissions.keySet()){
            Grading(s, 9);
        }
    }

    public void ShowGrades(){
        for(var v : grades.entrySet()){
            System.out.println(v.getKey().name + " -> " + v.getValue());
        }
    }

    public void Grading(Student Student, int marks){
        grades.put(Student, marks);
    }
}
