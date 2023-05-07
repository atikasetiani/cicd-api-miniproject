package starter.restapi.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteSingleCategoriesNegative {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE invalid product categories endpoints by ID 11349")
    public String setDeleteInvalidEndpoint(){
        return url + "category/11349";
    }
    @Step("I send DELETE HTTP request for categories endpoint")
    public void categoryDeleteRequest(){
        SerenityRest.given().delete(setDeleteInvalidEndpoint());
    }
    @Step("I didn't receive valid DELETE HTTP response code 404 Not Found for the categories endpoint")
    public void validHttpDeleteResponse404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
