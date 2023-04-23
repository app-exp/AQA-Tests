package aqa.zabelin;

import org.junit.jupiter.api.Test;

public class SeleniumTestRun extends SeleniumTestHelper {

    @Test
    void qaTests() {
        SeleniumTestMailRu.runTest();
    }
}