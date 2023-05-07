package starter.restapi.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetCategoriesByIDNegative {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET invalid categories endpoints by ID 1")
    public String setInvalidIDCategoriesEndpoint(){
        return url + "categories/1";

    }
    @Step("I send a GET request to the invalid categories endpoint")
    public void IDCategoriesHTTPGETRequest(){
        SerenityRest.given()
                .when()
                .get(setInvalidIDCategoriesEndpoint());

    }
    @Step("I receive valid HTTP response code 404 Not Found for the categories endpoint")
    public void IDCategoriesGetResponse404(){
        restAssuredThat(response ->response.statusCode(404));
        restAssuredThat(response -> response.body("$", notNullValue()));}

    @Step("I didn't received valid data for single product categories details by ID 1")
    public void emptyDataIDCategories() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
