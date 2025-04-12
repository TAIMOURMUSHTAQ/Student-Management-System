import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
class Student{
    Student(){
        System.out.println("\t\t\tWelcome to Student Management System");
        System.out.println("\n\t\tMenue" + "\n1. Add Students Data\n2. View Student Data\n3. Search Student Data\n4. Update Student Data\n5. Delete Student Data");
        //System.out.printf("%-50s %-20s %-20s %-20s %-20s %-20s","Menue","\n1. ADD Student Data", "\n2. View Student Data","\n3. Search Student Data","\n4. Update Student Data","\n5. Delete Student Data");
    }
    static String []StudentName={"Ali","Ahmed","Arsalan","Uzair","Zahid","Sahil","Taimour","Usman"};
    static int []RollNo={23,12,32,11,42,21,9,1};
    static String[] Section={"A","B","A","D","C","C","CA 3","CA 3"};
    static String[] Class={"10th","9th","9th","7th","8th","First Year","BSCS","BSCS"}; //initialized later as Class=new String[size];
    static int n;
    static int studentCount=8;
    void AddStudent(){
        System.out.println("Enter how many students you want to add:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int oldLength = StudentName.length;
        int newLength = oldLength + n;

        // Resize arrays to hold new data
        StudentName = Arrays.copyOf(StudentName, newLength);
        RollNo = Arrays.copyOf(RollNo, newLength);
        Class = Arrays.copyOf(Class, newLength);
        Section = Arrays.copyOf(Section, newLength);

        System.out.println("Enter names of Students:");
        for (int i = oldLength; i < newLength; i++) {
            StudentName[i] = sc.next();
        }

        System.out.println("Enter Roll numbers:");
        for (int i = oldLength; i < newLength; i++) {
            RollNo[i] = sc.nextInt();
        }

        System.out.println("Enter Classes:");
        for (int i = oldLength; i < newLength; i++) {
            Class[i] = sc.next();
        }

        System.out.println("Enter Sections:");
        for (int i = oldLength; i < newLength; i++) {
            Section[i] = sc.next();
        }

        System.out.println("\nYou have entered the following students:");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Student Name", "Roll No", "Class", "Section");

        for (int i = 0; i < newLength; i++) {
            System.out.printf("%-20s %-20d %-20s %-20s\n", StudentName[i], RollNo[i], Class[i], Section[i]);
        }
    }

    //void AddStudent(){
//        System.out.println("Enter Student's Data");
//        System.out.println("How many Student's data do you want to add more?");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        int oldLength= StudentName.length;
//        int newLength=oldLength+n;
//        studentCount+=n;
//        StudentName=new String[n];
//        System.out.println("Enter names of Students");
//        for (int i=0;i<n;i++){
//            StudentName[i]=sc.next();
//        }
//        RollNo=new int[n];
//        System.out.println("Enter Roll no of Students");
//        for (int i=0;i<n;i++) {
//            RollNo[i] = sc.nextInt();
//        }
//        Class=new String[n];
//        System.out.println("Enter Class of Students");
//        for (int i=0;i<n;i++) {
//            Class[i] = sc.next();
//        }
//            Section=new String[n];
//        System.out.println("Enter Section of Students");
//        for (int i=0;i<n;i++) {
//            Section[i] = sc.next();
//        }
//
//        System.out.println("You have entered following Student's Data:");
//        System.out.printf("%-20s %-20s %-20s %-20s\n", "Student Name", "Roll No", "Class", "Section");
//        // System.out.printf("%-20s %-20d %-20s %-20s\n","Student Name, Roll No, Class, Section");
//            for (int i = 0; i < newLength; i++) {
//                //You entered
//                // Student name:  ali	Student Roll No: 1	Student Class: one	Student Section: a
//                System.out.printf("%-20s %-20d %-20s %-20s\n", StudentName[newLength], RollNo[newLength], Class[newLength], Section[newLength]);
//            }
//
//    }
    void ViewStudent(){
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Student Name", "Roll No", "Class", "Section");
        for (int i = 0; i<studentCount; i++) {
            System.out.printf("%-20s %-20d %-20s %-20s\n", StudentName[i], RollNo[i], Class[i], Section[i]);
        }
        if(n>=1 && n<=n){
            for (int i = 0; i <=n; i++) {
                System.out.printf("%-20s %-20d %-20s %-20s\n", StudentName[i], RollNo[i], Class[i], Section[i]);
            }

        }
        else {
            for (int i = 0; i<8; i++) {
                System.out.printf("%-20s %-20d %-20s %-20s\n", StudentName[i], RollNo[i], Class[i], Section[i]);
            }
        }
//        System.out.printf("%-20s %-20d %-20s %-20s\n", "Ahmed", 123, "2nd", "A");
    }
    void SearchStudent(){
        System.out.println("\t\t\tSearch Student");
    }
    void UpdateStudent(){
        System.out.println("\t\t\tUpdate Student");
        System.out.println("Enter student name who's data you want to update...");
        String sname[];



    }
    void DeleteStudent(){
        System.out.println("\t\t\tDelete Student");
    }
public class Main {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in) ;
        String shouldContinue;
        do {
            {
                Student s = new Student();
                System.out.println("What do you want to do?");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice == 1) {
                    s.AddStudent();
                } else if (choice == 2) {
                    s.ViewStudent();
                } else if (choice == 3) {
                    s.SearchStudent();
                } else if (choice == 4) {
                    s.UpdateStudent();
                } else if (choice == 5) {
                    s.DeleteStudent();
                } else
                    System.out.println("OOPs....Invalid input");
            }
            System.out.println("Enter c to continue or Press any other key to exit");
            shouldContinue=c.next();
        }while(shouldContinue.startsWith("c"));
        System.out.println("Good Bye...Hope to see you soon!!!!");
    }
}}