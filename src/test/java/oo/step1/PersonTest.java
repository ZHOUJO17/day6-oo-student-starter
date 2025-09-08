package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void should_introduce_self_when_introduce_given_self_message() {
        Person person = new Person(0, "Tom", 18);
        // when introduce a person, then return a message with name and age
        assertEquals("My name is Tom. I am 18 years old.",person.introduce());
        // when equals two same id person then return true

        // when equals two different id person then return true
    }
}
