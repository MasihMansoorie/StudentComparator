package topStudentsProject;

import java.util.Comparator;

public class ScoreAndGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeComparator = s1.getGrade().compareTo(s2.getGrade());
        if(gradeComparator != 0) {
            return gradeComparator;
        }
       return Double.compare(s2.getScore(),s1.getScore());

    }
}










