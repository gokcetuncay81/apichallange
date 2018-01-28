package ApiTests;

import org.junit.Test;
import Utils.HelperMethods;
import static org.junit.Assert.assertEquals;

public class StatusCodeTest extends BaseTestSuite{

    @Test
    public void StatusCodeTest() {
        assertEquals("Status Check Failed!", 200, HelperMethods.checkStatusIs200(response));
    }

}
