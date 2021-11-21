package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTestExamples {

    @Test
    public void checkCountryAndPostal() {
        String url = "https://ipinfo.io/json";
        given()
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .assertThat()
                .body("country", equalTo("RU"),
                        "postal", equalTo("03027123"))
                .log()
                .all();
    }

    @Test
    public void getJsonFromHtml() throws JsonProcessingException {
        String url = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
        ObjectMapper objectMapper = new ObjectMapper();
        String responseHtmlBody = given()
                .when()
                .get(url)
                .htmlPath()
                .get("html.body")
                .toString();
        JsonNode bodyJson = objectMapper.readTree(responseHtmlBody);
        int sumOfAll = 0;
        for (JsonNode s : bodyJson.get("result:").get("statements")) {
            String a = s.get("AMOUNT").textValue();
            System.out.println("The amount value fetched is " + a);
            sumOfAll = sumOfAll + Integer.parseInt(a);
        }
        System.out.println("The total amount is " + sumOfAll);
    }

}
