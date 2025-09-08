package oo.step2;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    @Test
    void should_introduce_self_when_introduce_given_self_message() {
        Student student = new Student(0, "Tom", 18);
        // when introduce a student, then return a message with name and age
        assertEquals("My name is Tom. I am 18 years old. I am a student.",student.introduce());
    }

    @Test
    void should_get_true_when_equals_given_two_persons_with_same_id() {
        Person student = new Person(0, "Tom", 18);
        Person student1 = new Person(0,"Jonny",19);
        // when equals two same id student then return true
        assertEquals(student,student1);
    }

    @Test
    void should_get_false_when_equals_given_two_persons_with_different_id() {
        Person student = new Person(0, "Tom", 18);
        Person student1 = new Person(1,"Jonny",19);
        // when equals two different id student then return true
        assertNotEquals(student,student1);
    }
}
