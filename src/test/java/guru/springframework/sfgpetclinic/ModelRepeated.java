package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("model")
public interface ModelRepeated {

    @BeforeEach
    public default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("Before each " + testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());
    }
}
