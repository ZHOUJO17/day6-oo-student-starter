package oo;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a student.",name,age);
    }


    @Override
    public boolean equals(Object obj) {
        Student person = (Student) obj;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
