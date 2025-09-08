package oo;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person{
    private static final String TEACHER_LABEL = "I am a teacher.";
    Set<KClass> klassSet = new HashSet<>();

    void assignTo(KClass kClass){
        klassSet.add(kClass);
    }

    public Teacher() {
        super();
    }
    public Teacher(int id, String name, int age, Set<KClass> klassSet) {
        super(id, name, age);
        this.klassSet = klassSet;
    }

    public boolean belongsTo(KClass kClass){
        return klassSet.contains(kClass);
    }

    boolean isTeaching(Student student){
        return klassSet.contains(student.getkClass());
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + TEACHER_LABEL;
    }
}
