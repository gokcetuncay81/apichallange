package Utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import java.util.*;
import java.util.concurrent.TimeUnit;
import com.jayway.jsonpath.JsonPath;


public class HelperMethods {

    public enum imageTypes {
        desktop_image,
        tablet_image,
        mobile_image
    }

    public static int checkStatusIs200 (Response response) {
        return response.getStatusCode();
    }

    public static long checkResponseTime (Response response) {
        return response.timeIn(TimeUnit.MILLISECONDS);
    }

    public static List<String> getImageUrlList(Response response){
        List<String> imageUrlList = new ArrayList<String>();

        for (imageTypes imageType : imageTypes.values()) {
            List<String> tmpList = JsonPath.read(response.asString(),"$.."+imageType+".url");
            //join lists
            imageUrlList.addAll(tmpList);
        }

        return imageUrlList;
    }

    public static List<String> getComponentList (Response response) {
        List<String> result = new ArrayList<String>();
        //Get all components in to an array
        List<LinkedHashMap> componentList = JsonPath.read(response.asString(),"$..component");

        ObjectMapper objectMapper = new ObjectMapper();
        //Convert HashMap to Json
        for(LinkedHashMap component : componentList) {
            String mapToJson = null;
            try {
                mapToJson = objectMapper.writeValueAsString(component);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            result.add(mapToJson);
        }

        return result;

    }


}
