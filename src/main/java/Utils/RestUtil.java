package Utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RestUtil {
    public static String path;

    public static void setBaseURI (String baseURI){
        RestAssured.baseURI=baseURI;
    }

    public static void setBasePath (String basePath) {
        RestAssured.basePath = basePath;
    }

    public static void resetBasePath() {
        RestAssured.basePath = null;
    }

    public static void setContentType(ContentType contentType) {
        given().contentType(contentType);
    }

    public static Response getResponse() {
        return get(path);
    }

}
