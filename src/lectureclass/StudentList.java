/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectureclass;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private final ArrayList<Student> studentList = new ArrayList<>();
    public void enterStudentList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        for (Student student : studentList) {
            student.displayStudentInfo();
            System.out.println("----------------------------");
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Enter new details for the student:");
            student.enterStudentInfo();
            return true;
        }
        return false;
    }
}
