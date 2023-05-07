package starter.restapi.Products;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class  GetAllProductsNegative {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set the GET endpoint part")
    public String GetEndpoints(){
        return url + "product";

    }
    @Step("I send a request to the HTTP GET part")
    public void partGetHTTPRequest(){
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest.given()
                .accept("text/plain")
                .when()
                .get(GetEndpoints());

    }
    @Step("I receive a valid HTTP response code 404 Not Found")
    public void HTTPresponse404(){
        restAssuredThat(response ->response.statusCode(404));
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    @Step("I didn't received valid data for all product details")
    public void emptyData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
