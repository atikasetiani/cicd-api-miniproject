package starter.restapi.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCategoriesPositive {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET product category endpoints")
    public String setGetCategoriesEndpoints(){
        return url + "categories ";

    }
    @Step("I send category HTTP GET request")
    public void categoriesGetHTTPRequest(){
        SerenityRest.given()
                .when()
                .get(setGetCategoriesEndpoints());

    }
    @Step("I receive a valid category HTTP response code 200 OK")
    public void HTTPCategoriesResponse200(){
        restAssuredThat(response ->response.statusCode(200));
        restAssuredThat(response -> response.body("$", notNullValue()));

    }

    @Step("I received valid data for all product category details")
    public void validCategoriesData() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
