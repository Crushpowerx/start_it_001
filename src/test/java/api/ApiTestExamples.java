package api;

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


}
