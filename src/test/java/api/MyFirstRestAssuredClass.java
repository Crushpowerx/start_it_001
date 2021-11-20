package api;

import io.restassured.http.ContentType;
import io.restassured.internal.path.xml.NodeImpl;
import io.restassured.path.xml.element.Node;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.path.xml.XmlPath.from;

public class MyFirstRestAssuredClass {
    private static final String url = "http://demo.guru99.com/V4/sinkministatement.php";
    private static final String url2 = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
    private static final String url3 = "https://dummy.restapiexample.com/api/v1/employees";

    public static NodeImpl getResponseBody(String url) {
        return given()
                .log()
                .all()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .htmlPath()
                .get("html");
    }

    public static void getResponse(String url) {
        given()
                .accept(ContentType.JSON)
                .when().get(url).then().log().all();
    }

    public static void getResponseStatus() {
        int statusCode = given().queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1").when().get(url).getStatusCode();
        System.out.println("The response status is " + statusCode);

        given().when().get(url).then().assertThat().statusCode(200);
    }

    public static void getResponseHeaders() {
        System.out.println("The headers in the response " + when().get(url).then().extract().headers());
    }

    public static void getResponseTime() {
        System.out.println("The time taken to fetch the response " + when().get(url).timeIn(TimeUnit.MILLISECONDS)
                + " milliseconds");
    }

    public static void getResponseContentType() {
        System.out.println("The content type of response " + when().get(url).then().extract().contentType());
    }

    public static void getSpecificPartOfResponseBody() {
        ArrayList<String> amounts = when().get(url2).then().extract().body().path("result.statements.AMOUNT");
        int sumOfAll = 0;
        for (String a : amounts) {

            System.out.println("The amount value fetched is " + a);
            sumOfAll = sumOfAll + Integer.parseInt(a);
        }
        System.out.println("The total amount is " + sumOfAll);
    }

    public static void getSpecificPartOfResponseBody2() {
//        String htmlBody = when().get(url2).andReturn().getBody().asString().replace("&quot;", "\"");

        String xml = when().get(url2).andReturn().body().asString();
        Node category = from(xml).get("result");
        System.out.println(category);

//        JSONParser parser = new JSONParser();
//        JSONObject htmlBodyAsJson = (JSONObject) parser.parse(htmlBody);
//        System.out.println(htmlBodyAsJson);
//        JSONObject result = (JSONObject) htmlBodyAsJson.get("result");
//        System.out.println(result);
//        JSONArray statements = (JSONArray) result.get("statements");
//        System.out.println(statements);
//        int sumOfAll = 0;
//        for (Object s : statements) {
//            JSONObject j = (JSONObject) s;
//            String a = j.get("AMOUNT").toString();
//            System.out.println("The amount value fetched is " + a);
//            sumOfAll = sumOfAll + Integer.parseInt(a);
//        }
//        System.out.println("The total amount is " + sumOfAll);
    }

    @Test
    public void test1() {
        NodeImpl html = getResponseBody(url2);
        System.out.println(html.get(0));
    }
}
