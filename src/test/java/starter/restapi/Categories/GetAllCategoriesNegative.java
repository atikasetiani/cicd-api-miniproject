package starter.restapi.Categories;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCategoriesNegative {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET invalid product category endpoints")
    public String setInvalidCategoryEndpoints(){
        return url + "category";

    }
    @Step("I send categories HTTP GET request")
    public void categoriesHTTPGetRequest(){
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest.given()
                .accept("text/plain")
                .when()
                .get(setInvalidCategoryEndpoints());

    }
    @Step("I receive a valid category HTTP response code 404 Not Found")
    public void HTTPCategoriesResponse404(){
        restAssuredThat(response ->response.statusCode(404));
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    @Step("I didn't received valid data for all product category details")
    public void emptyCategoriesData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
