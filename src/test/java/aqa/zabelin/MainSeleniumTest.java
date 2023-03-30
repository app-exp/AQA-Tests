package aqa.zabelin;

import org.junit.jupiter.api.Test;

public class MainSeleniumTest  extends TestHelperSelenium {

    @Test
    void qualityLabTest() throws NullPointerException {
        QualityLabTest.runQualityLabTest();
    }
}
