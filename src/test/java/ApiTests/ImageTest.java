package ApiTests;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import Utils.HelperMethods;
import io.restassured.RestAssured;
import java.util.List;
import static io.restassured.RestAssured.get;

public class ImageTest extends BaseTestSuite{

    @Test
    public void ImageUrlAccessibleCheck() {
        List<String> imageUrlList = HelperMethods.getImageUrlList(response);

        for(String imageUrl : imageUrlList){
            RestAssured.useRelaxedHTTPSValidation();
//            assertEquals(String.format("Image url %s is not accessible",imageUrl), 200, get(imageUrl).getStatusCode());
            String statusCode = Integer.toString(get(imageUrl).getStatusCode());
            Assert.assertThat(String.format("Image url %s is not accessible",imageUrl),statusCode, CoreMatchers.not(CoreMatchers.startsWith("4")));
        }
    }
}
