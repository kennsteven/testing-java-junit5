package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest  implements ModelTests {

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

    @RepeatedTest(value = 10, name ="{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My repeated test")
    @Test
    void myReapetedTest() {
        //todo imple
    }
}