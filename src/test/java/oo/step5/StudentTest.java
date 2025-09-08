package oo.step5;

import oo.KClass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void should_get_message_when_introduce_given_in_class_student() {
        KClass kClass = new KClass(123);
        Student student = new Student(1,"Tom",18);
        student.join(kClass);
        kClass.assignLeader(student);
        // when assign leader given student is not in class then print prompt message
        assertEquals("My name is Tom. I am 18 years old. I am a student. I am the leader of class 123.",student.introduce());
    }

}
