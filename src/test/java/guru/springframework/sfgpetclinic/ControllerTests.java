package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controller")
public interface ControllerTests {

    @BeforeAll
    public default void beforeAll(){
        System.out.println("Lets do something here");
    }


}
