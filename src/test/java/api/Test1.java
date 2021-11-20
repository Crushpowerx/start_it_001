package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test1 {
    private final String url = "https://ipinfo.io/json";

    @Test
    public void checkCountry() {
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
