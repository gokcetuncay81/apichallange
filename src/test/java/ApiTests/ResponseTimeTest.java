package ApiTests;

import org.junit.Test;
import Utils.HelperMethods;
import static org.junit.Assert.assertTrue;

public class ResponseTimeTest extends BaseTestSuite {

    @Test
    public void ResponseTimeTest() {
        assertTrue("Response time took more than 1 sec!", HelperMethods.checkResponseTime(response)<1000);
    }


}
