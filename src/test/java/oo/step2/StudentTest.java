package oo.step2;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void should_introduce_self_when_introduce_given_self_message() {
        Student student = new Student(0, "Tom", 18);
        // when introduce a student, then return a message with name and age
        assertEquals("My name is Tom. I am 18 years old. I am a student.",student.introduce());
    }
    // when equals two same id student then return true

    // when equals two different id student then return true
}
