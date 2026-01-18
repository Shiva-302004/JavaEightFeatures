package com.gevernova.javaEightfeatures.DayOne.VirtualClassRoom;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student shiva = new Student(1, "Shiva Verma");
        Student aryan = new Student(2, "Aryan");
        Student Jay = new Student(3, "Jay V");
        Student Ashutosh = new Student(4, "Ashutosh");

        Instructor Vinay = new Instructor(1, "Vinay");
        Instructor Karthik = new Instructor(2, "Karthik");

        Course java1 = new Course(1, "java1", Karthik);
        Course java2 = new Course(2, "java2", Vinay);

        // let shiva and aryan want to join java 1
        // and jay and ashutosh want to join java 2
        java1.RequestEnrollment(shiva);
        java1.RequestEnrollment(aryan);
        java2.RequestEnrollment(Jay);
        java2.RequestEnrollment(Ashutosh);
        System.out.println();

        // now suppose instructor want to see the pending approval requests
        java1.seeRequestsForApproval();
        java2.seeRequestsForApproval();

        System.out.println();

        // now suppose instructor want to approve requests
        java1.ApproveEnrollment(shiva);
        java1.seeRequestsForApproval();
        System.out.println();
        java2.ApproveEnrollment(Jay);
        java2.ApproveEnrollment(Ashutosh);
        java1.RejectEnrollment(aryan);

        // if instructor want to add assignment for students in particular course
        Assignments generatedAssignment =
                java1.GenerateAssignment("Virtual ClassRoom", LocalDate.now());
        generatedAssignment.submit(shiva, "virtual classroom completed", LocalDate.now());

        // instructor can review assignment and can do marking
        generatedAssignment.DoGradingForOnTime();
        generatedAssignment.DoGradingForLate();

        System.out.println();
        generatedAssignment.ShowGrades();
    }
}
