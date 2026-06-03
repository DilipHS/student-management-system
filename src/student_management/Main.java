package student_management;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sm.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    sm.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    sm.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();
                    sm.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
