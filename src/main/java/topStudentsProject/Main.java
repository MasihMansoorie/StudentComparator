package topStudentsProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // operating by the help of ( do while loop ) and (switch case )
        int choice =0;

        do {
            System.out.println("---------- Welcome to Student Table  -----------");
            System.out.println("1 - Display Student list");
            System.out.println("2 - Sort By FirstName");
            System.out.println("3 - Sort By LastName");
            System.out.println("4 - Sort By Score");
            System.out.println("5 - Sort By Score and Grade");
            System.out.println("6 - Exit");

            System.out.println("Enter your choice Number between 1 - 6 :");



            try {
                 choice = Integer.parseInt((scanner.nextLine()));

            } catch(Exception e){
           //     throw new NumberFormatException();
                }

            switch (choice) {
                case 1:
                    StudentComparatorMethods.displayAllStudent(StudentComparatorMethods.getAllStudent());
                    break;
                case 2:
                    StudentComparatorMethods.sortStudentByFirstName(StudentComparatorMethods.getAllStudent());
                    break;
                case 3:
                    StudentComparatorMethods.sortStudentByLastName(StudentComparatorMethods.getAllStudent());
                    break;
                case 4:
                   StudentComparatorMethods.sortStudentByScore(StudentComparatorMethods.getAllStudent());
                    break;
                case 5:
                    StudentComparatorMethods.sortStudentByScoreAndGrade(StudentComparatorMethods.getAllStudent());
                    break;
                case 6:
                    System.out.println("Exiting the Table, Good Bye !");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        } while (choice != 6);

        scanner.close();

        }

}