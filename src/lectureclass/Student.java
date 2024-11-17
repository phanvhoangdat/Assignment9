/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectureclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;
    public Student() {}
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.studentId = sc.nextLine();
        System.out.print("Enter Full Name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid Date Format! Setting date to null.");
            this.dateOfBirth = null;
        }
        System.out.print("Enter Major: ");
        this.major = sc.nextLine();
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
    }

    public void displayStudentInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + (dateOfBirth != null ? sdf.format(dateOfBirth) : " Thong tin khong hop le!"));
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}