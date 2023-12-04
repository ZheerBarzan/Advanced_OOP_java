import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Course[] Courses = new Course[]{new Course("Advanced OOP","Sun","4:30","S16",100),
                                        new Course("Cloud Computing","TUE","4:30","F13",95),
                                        new Course("Software Requirements","WED","4:30","F11",97)};
        Course[] Courses2 =new Course[]{new Course("microbiology","Sun","8:00","S16",92),
                                        new Course("academic english","Sun","12:00","F13",90),
                                        new Course("kurdology","WED","1:00","F11",83)

        };

        students.add(new Student(1,"zhir barzan",Courses,"PG"));
        students.add(new Student(2,"zhyar barzan",Courses2,"UG"));

       for (int i=0;i<students.size();i++){
           System.out.println(students.get(i));

       }
        students.remove(0);





    }



}