package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest  {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Prop Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName())
        );
    }

    @Test
    void groupedAssertionsMsg() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Prop Set",
                () -> assertEquals("Joe", person.getFirstName(), "First name Failed"),
                () -> assertEquals("Buck", person.getLastName(), "Last name failed")
                );
    }
}