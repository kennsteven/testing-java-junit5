package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test
    void dependentInsertions() {
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Poperties test",
                () -> assertAll("Person properties",
                            () -> assertEquals("Joe", owner.getFirstName(), "First name do not match"),
                            () -> assertEquals("Buck", owner.getLastName())
                    ),
                () -> assertAll("Owner Properties",
                            () -> assertEquals("Key West", owner.getCity(), "City do not match"),
                            () -> assertEquals("1231231234", owner.getTelephone()))
                );
    }

    @ParameterizedTest
    @ValueSource(strings={"Spring", "Framework", "Kenneht"})
    void testValueScore(String val) {
        System.out.println(val);
    }
}