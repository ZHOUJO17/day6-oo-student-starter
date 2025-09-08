package oo.step5;

import oo.KClass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class KlassTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_print_message_when_assignLeader_given_not_in_class_student() {
        KClass kClass = new KClass(123);
        Student student = new Student(1,"Tom",18);
//        r
        // when assign leader given student is not in class then print prompt message
//        assertThat(outContent.toString()).contains("It is not one of us.");
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> {
            kClass.assignLeader(student);
        });
        assertEquals("It is not one of us.",runtimeException.getMessage());
    }

}
