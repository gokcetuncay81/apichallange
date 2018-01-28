package ApiTests;

import org.junit.Test;
import Utils.HelperMethods;
import java.util.List;
import com.jayway.jsonpath.JsonPath;
import static org.junit.Assert.*;

public class AnalyticsTest extends BaseTestSuite {

    @Test
    public void VerifyComponentHasAnalyticsName() {
        List<String> componentList = HelperMethods.getComponentList(response);
        int componentNodeNumber =0;

        for(String component : componentList) {
            componentNodeNumber++;
            List<String> analyticsNames = JsonPath.read(component,"$..analytics_name");
            assertTrue(String.format("A component has no analytics_name in it. Component Node Number: %s",componentNodeNumber), analyticsNames.size()>0);
        }
    }
}
