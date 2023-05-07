package starter.restapi.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteSingleCategoriesPositive {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE product categories endpoints by ID 11349")
    public String setDeleteValidEndpoint(){
        return url + "categories/11349";
    }
    @Step("I send DELETE HTTP request for the categories endpoint")
    public void categoryDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteValidEndpoint());
    }
    @Step("I receive valid DELETE HTTP response code 200 OK for the categories endpoint")
    public void validHttpDeleteResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
