package oo.step4;

import oo.KClass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    void should_get_false_when_belongsTo_given_not_assigned_class_teacher() {
        KClass kClass = new KClass(123);
        Teacher teacher = new Teacher();
        // when belongsTo give teacher does not teach the class then return false
        assertFalse(teacher.belongsTo(kClass));
    }

    @Test
    void should_get_true_when_belongsTo_given_assigned_class_teacher() {
        KClass kClass = new KClass(123);
        Teacher teacher = new Teacher();
        teacher.assignTo(kClass);
        // when belongsTo give teacher teach the class then return true
        assertTrue(teacher.belongsTo(kClass));
    }

    @Test
    void should_get_true_when_belongsTo_given_assigned_to_multi_classes_teacher() {
        KClass kClass = new KClass(123);
        KClass kClass1 = new KClass(124);
        Teacher teacher = new Teacher();
        teacher.assignTo(kClass);
        teacher.assignTo(kClass1);
        // when belongsTo given teacher teach multiple classes then return true
        assertTrue(teacher.belongsTo(kClass));
        assertTrue(teacher.belongsTo(kClass1));
    }

    @Test
    void should_get_message_when_introduce_given_assigned_to_one_class_teacher() {
        KClass kClass = new KClass(123);
        Teacher teacher = new Teacher(1,"Tom",18);
        teacher.assignTo(kClass);
        //when introduce given teacher teach one class then return message
        assertEquals("My name is Tom. I am 18 years old. I am a teacher. I teach Class 123.",teacher.introduce());
    }

    @Test
    void should_get_message_when_introduce_given_assigned_to_multi_classes_teacher() {
        KClass kClass = new KClass(123);
        KClass kClass1 = new KClass(1234);
        Teacher teacher = new Teacher(1,"Tom",18);
        teacher.assignTo(kClass);
        teacher.assignTo(kClass1);
        // when introduce given teacher teach multiple classes then return message
        assertEquals("My name is Tom. I am 18 years old. I am a teacher. I teach Class 123, 1234.",teacher.introduce());
    }

    @Test
    void should_get_false_when_isTeaching_given_student_assigned_to_class_taught_by_teacher() {
        KClass kClass = new KClass(123);
        Teacher teacher = new Teacher(1,"Tom",18);
        teacher.assignTo(kClass);
        Student student = new Student(2,"Jonny",18);
        student.join(kClass);
        // when isTeaching given student not in the class taught by teacher then should return false
        assertTrue(teacher.isTeaching(student));
    }

    // when isTeaching given student in the class taught by teacher then return true

    // when isTeaching given student in any class taught by teacher then return true
}
