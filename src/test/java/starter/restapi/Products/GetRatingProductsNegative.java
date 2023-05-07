package starter.restapi.Products;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetRatingProductsNegative {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET invalid rating endpoints")
    public String GetInvalidRatingEndpoints(){
        return url + "product/2/ratings";

    }
    @Step("I send GET to HTTP request")
    public void ratingGetHTTPRequest(){
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest.given()
                .accept("text/plain")
                .when()
                .get(GetInvalidRatingEndpoints());

    }
    @Step("I receive valid rating HTTP response code 404 Not Found")
    public void HTTPRatingResponse404(){
        restAssuredThat(response ->response.statusCode(404));
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    @Step("I didn't received valid data for rating product")
    public void emptyRatingData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
