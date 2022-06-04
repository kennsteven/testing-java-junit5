package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeated;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTest implements ModelRepeated {


    @RepeatedTest(value = 10, name ="{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My repeated test")
    void myReapetedTest() {
        //todo imple
    }

    /**
     * DI= dependency injection
     */
    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 10, name ="{displayName} : {currentRepetition}")
    @DisplayName("Test PersonTest")
    void personTest() {
        //todo imple
    }
}
