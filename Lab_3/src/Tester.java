import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        // A) Create an Arraylist of type Student.
        ArrayList<Student> students = new ArrayList<>();
        /* B) Create a Student object and add it to anArraylist.Note that foreach
         student, you should define 3 Courses and save them in an array and
        then use the array for creating the object of the student.*/
        Course[] Courses = new Course[]{new Course("Advanced OOP","Sun","4:30","S16",100),
                                        new Course("Cloud Computing","TUE","4:30","F13",95),
                                        new Course("Software Requirements","WED","4:30","F11",97)};
        students.add(new Student(1,"zhir barzan",Courses,"PG"));


        // C) Create another student and repeat the above process and add it to the arraylist.
        Course[] Courses2 =new Course[]{new Course("microbiology","Sun","8:00","S16",92),
                new Course("academic english","Sun","12:00","F13",90),
                new Course("kurdology","WED","1:00","F11",83)};
        students.add(new Student(2,"zhyar barzan",Courses2,"UG"));

        // D) Print the content of the Arraylist
       showArrayList(students);

        // E) Delete the first Student from the Arraylist.
       students.removeFirst();

       // after the removal
        System.out.println("after the removal!!!\n");
        showArrayList(students);

    }
    private static  void  showArrayList(ArrayList<Student> students){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
    }
}