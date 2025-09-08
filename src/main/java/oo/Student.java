package oo;

public class Student extends Person{
    private static final String STUDENT_LABEL = "I am a student.";

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + STUDENT_LABEL;
    }
}
