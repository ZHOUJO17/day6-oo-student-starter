package oo;

public class Teacher extends Person{
    private static final String TEACHER_LABEL = "I am a teacher.";

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + TEACHER_LABEL;
    }
}
