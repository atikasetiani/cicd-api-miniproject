package starter.restapi.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoriesByIDPositive {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set a GET valid categories endpoints by ID 12513")
    public String setValidIDCategoryEndpoints(){
        return url + "categories/12513";

    }
    @Step("I send a GET request to the valid categories endpoint")
    public void IDCategoryGetRequest(){
        SerenityRest.given()
                .when()
                .get(setValidIDCategoryEndpoints());

    }
    @Step("I receive valid HTTP response code 200 OK for the categories endpoint")
    public void HTTPIDCategoryResponse200(){
        restAssuredThat(response ->response.statusCode(200));
    }

    @Step("I received valid data for single product categories by ID 12513")
    public void validDataIDCategory() {
        restAssuredThat(response -> response.body("data.ID", equalTo(12513)));
    }
}
