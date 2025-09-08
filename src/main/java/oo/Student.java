package oo;

public class Student extends Person{
    private static final String STUDENT_LABEL = "I am a student.";
    private static final String CLASS_LABEL = "I am in class %d.";
    private static final String LEADER_LABEL = "I am the leader of class %d.";

    private KClass kClass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " " + STUDENT_LABEL;
        if(kClass!=null) {
            if(kClass.isLeader(this)){
                result += " " + String.format(LEADER_LABEL,kClass.getNumber());
            } else{
                result += " " + String.format(CLASS_LABEL,kClass.getNumber());
            }
        }
        return result;
    }

    public void join(KClass kClass){
        this.kClass = kClass;
    }

    public boolean isIn(KClass kClass){
        return this.kClass != null && this.kClass.getNumber() == kClass.getNumber();
    }

    public KClass getkClass() {
        return kClass;
    }
}
