package oo.step3;

import oo.KClass;
import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void should_get_false_when_isIn_given_not_join_class_student() {
        KClass kClass = new KClass(123);
        Student student = new Student(0, "Tom", 18);
        // when student not join klass and isIn klass then return false
        assertFalse(student.isIn(kClass));
    }

    @Test
    void should_get_true_when_isIn_given_joined_class_student() {
        KClass kClass = new KClass(123);
        Student student = new Student(0, "Tom", 18);
        student.join(kClass);
        // when student not join klass and isIn klass then return false
        assertTrue(student.isIn(kClass));
    }

    // when student join klass and isIn klass then return false

    // when student join two klass then return recently klass

    // when introduce a student is in a class then return message with name age and class

}
