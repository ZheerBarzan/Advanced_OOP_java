import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private Course[] module;
    private double average;
    private String program;

    public Student(int id, String name, Course[] module, String program) {
        this.id = id;
        this.name = name;
        this.module = module;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getModule() {
        return module;
    }

    public void setModule(Course[] module) {
        this.module = module;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", module=" + Arrays.toString(module) +
                ", average=" + average +
                ", program='" + program + '\'' +
                '}';
    }
    private double calculateAverage(){

        return 0;
    }
}
