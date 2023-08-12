package topStudentsProject;

import java.util.Arrays;
import java.util.List;

public class StudentComparatorMethods {


    public StudentComparatorMethods() {

    }

    public static List<Student> getAllStudent(){
        List<Student> list = Arrays.asList(
                new Student(101,"George","Washington","George Washington University",93,'A'),
                        new Student(102,"Thomas","Jefferson","Maryland University",88,'B'),
                        new Student(103,"Bill","Gates","Harvard University",97,'A') ,
                        new Student(104,"Mark","Warner","Virginia University",82,'B') ,
                        new Student(105,"Elon","Musk","Oxford University",79,'C') ,
                        new Student(106,"Lisa","Watson","George Mason University",74,'C') ,
                        new Student(107,"Adam","Khan","Chicago University",66,'D') ,
                        new Student(108,"Robert","Carlos","Stanford University",66,'D'),
                        new Student(109,"Maria","Hernandez","American University",100,'A'),
                        new Student(110,"David","Alaba","Cambridge University",51,'F'));

        return list;
    }

    public static void sortStudentByFirstName(List<Student> list){
        list.sort(new FirstNameComparator());
        displayAllStudent(list);
    }
    public static void sortStudentByLastName(List<Student> list){
        list.sort(new LastNameComparator());
        displayAllStudent(list);
    }
    public static void sortStudentByScore(List<Student> list){
        list.sort(new ScoreComparator());
        displayAllStudent(list);
    }
    public static void sortStudentByScoreAndGrade(List<Student> list){
        list.sort(new ScoreAndGradeComparator());
        displayAllStudent(list);
    }
    public static void displayAllStudent(List<Student> list){
        for (Student s : list) {
            System.out.println(s);
        }
    }


}
