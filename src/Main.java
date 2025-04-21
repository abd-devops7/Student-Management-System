//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

 class Student {
    private String name;
    private String fatherName;
    private int rollNumber;
    private String cellNumber;

    // Getters
    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
        // Here name is a method variable and method is setName
        //this.name is a instance variable
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
}


class Course {

     String Physics;


}

class Grade {


}



public class Main {


    public static void main(String[] args) {


        class StudentManagementSystem {
            Student s;

            void Add_student() {

                Scanner sc = new Scanner(System.in);
                s = new Student();

                System.out.print("Enter name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter father's name: ");
                s.setFatherName(sc.nextLine());

                System.out.print("Enter roll number: ");
                s.setRollNumber(sc.nextInt());
                sc.nextLine(); // clear buffer

                System.out.print("Enter cell number: ");
                s.setCellNumber(sc.nextLine());

            }

            void Show_Students() {

                // Display all data using getters
                System.out.println("\n--- Student Details ---");
                System.out.println("Name: " + this.s.getName());
                System.out.println("Father's Name: " + this.s.getFatherName());
                System.out.println("Roll Number: " + this.s.getRollNumber());
                System.out.println("Cell Number: " + this.s.getCellNumber());
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Press Enter to exit...");
                sc2.nextLine(); // waits for Enter




            }

        }

        StudentManagementSystem SMS = new StudentManagementSystem();
        //       SMS.Add_student();
        int counter=1;
        // make it a true statement to keep running while loop
        while (counter<10) {
            Scanner sc = new Scanner(System.in);
            int choice;

            System.out.println("===== MENU =====");
            System.out.println("Please select from below options");
            System.out.println("1. Add Student");
            System.out.println("2. Show Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SMS.Add_student();
                    break;

                case 2:
                    SMS.Show_Students();
            }

        }
    }

}
