package topStudentsProject;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getScore(),s1.getScore());
    }
}
