package oo.step4;

import oo.KClass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    // when belongsTo given teacher teach multiple classes then return true

    //when introduce given teacher teach one class then return message

    // when introduce given teacher teach multiple classes then return message

    // when isTeaching given student not in the class taught by teacher then should return false

    // when isTeaching given student in the class taught by teacher then return true

    // when isTeaching given student in any class taught by teacher then return true
}
