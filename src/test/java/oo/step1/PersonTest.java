package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    @Test
    void should_introduce_self_when_introduce_given_self_message() {
        Person person = new Person(0, "Tom", 18);
        Person person1 = new Person(0,"Jonny",19);
        // when introduce a person, then return a message with name and age
        assertEquals("My name is Tom. I am 18 years old.",person.introduce());
    }

    @Test
    void should_get_true_when_equals_given_two_persons_with_same_id() {
        Person person = new Person(0, "Tom", 18);
        Person person1 = new Person(0,"Jonny",19);
        // when equals two same id person then return true
        assertEquals(person,person1);
    }
    @Test
    void should_get_false_when_equals_given_two_persons_with_different_id() {
        Person person = new Person(0, "Tom", 18);
        Person person1 = new Person(1,"Jonny",19);
        // when equals two different id person then return true
        assertNotEquals(person,person1);
    }

}
