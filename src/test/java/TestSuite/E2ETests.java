package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ApiTests.ResponseTimeTest;
import ApiTests.StatusCodeTest;
import ApiTests.AnalyticsTest;
import ApiTests.ImageTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        StatusCodeTest.class,
        ResponseTimeTest.class,
        ImageTest.class,
        AnalyticsTest.class
})
public class E2ETests {

}
