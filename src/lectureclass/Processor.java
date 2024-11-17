/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectureclass;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;

        do {
            System.out.println("========== Student Management ==========");
            System.out.println("1. Enter student information");
            System.out.println("2. Display all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentList.enterStudentList();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to find: ");
                    String idToFind = sc.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    String idToDelete = sc.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID to edit: ");
                    String idToEdit = sc.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
}
