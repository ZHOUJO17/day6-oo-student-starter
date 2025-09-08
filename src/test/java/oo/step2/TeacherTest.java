package oo.step2;

import oo.Teacher;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TeacherTest {

    @Test
    void should_introduce_self_when_introduce_given_self_message() {
        Teacher teacher = new Teacher(0, "Tom", 18);
        // when introduce a student, then return a message with name and age
        assertEquals("My name is Tom. I am 18 years old. I am a teacher.",teacher.introduce());
    }

    @Test
    void should_get_true_when_equals_given_two_teachers_with_same_id() {
        Teacher student = new Teacher(0, "Tom", 18);
        Teacher student1 = new Teacher(0,"Jonny",19);
        // when equals two same id student then return true
        assertEquals(student,student1);
    }

    @Test
    void should_get_false_when_equals_given_two_teachers_with_different_id() {
        Teacher student = new Teacher(0, "Tom", 18);
        Teacher student1 = new Teacher(1,"Jonny",19);
        // when equals two different id student then return true
        assertNotEquals(student,student1);
    }
}
