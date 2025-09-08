package oo;

import java.io.InvalidObjectException;

public class KClass {
    private static final String NOT_IN_CLASS_ASSIGN_LEADER_ERROR_MESSAGE = "It is not one of us.";
    private int number;

    private Student leader;

    public int getNumber() {
        return number;
    }

    public boolean isLeader(Student student){
        return leader == student;
    }

    public void assignLeader(Student student) {
        if(student.getkClass() != this) {
            throw new RuntimeException(NOT_IN_CLASS_ASSIGN_LEADER_ERROR_MESSAGE);
//            System.out.println(NOT_IN_CLASS_ASSIGN_LEADER_ERROR_MESSAGE);
        } else {
            leader = student;
        }
    }

    public KClass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        KClass kClass = (KClass) obj;
        return number == kClass.getNumber();
    }

    @Override
    public int hashCode() {
        return number;
    }
}
