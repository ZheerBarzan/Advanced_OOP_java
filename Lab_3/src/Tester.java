import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        Course[] Courses = new Course[]{new Course("Advanced OOP","Sun","4:30","S16",100),
                                        new Course("Cloud Computing","TUE","4:30","F13",95),
                                        new Course("Software Requirements","WED","4:30","F11",97)};
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"zhir",Courses,"PG"));

        System.out.println(students.get(0).toString());
    }
}