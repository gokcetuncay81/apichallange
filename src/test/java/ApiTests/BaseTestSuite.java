package ApiTests;

import org.junit.Before;
import Utils.RestUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseTestSuite {

    public Response response = null;

    @Before
    public void SetUp() {
        RestUtil.setBaseURI("https://www.adidas.fi");
        RestUtil.setBasePath("api/pages");
        RestUtil.path = "landing?path=/";
        RestUtil.setContentType(ContentType.JSON);
        response = RestUtil.getResponse();
    }

}
