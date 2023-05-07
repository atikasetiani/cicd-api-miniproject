package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Categories.*;
import starter.restapi.Products.GetCommentProductsNegative;

public class CategoriesSteps {
    @Steps
    GetAllCategoriesPositive getAllCategoriesPositive;
    @Steps
    GetAllCategoriesNegative getAllCategoriesNegative;
    @Steps
    GetCategoriesByIDPositive getCategoriesByIDPositive;
    @Steps
    GetCategoriesByIDNegative getCategoriesByIDNegative;
    @Steps
    DeleteSingleCategoriesPositive deleteSingleCategoriesPositive;
    @Steps
    DeleteSingleCategoriesNegative deleteSingleCategoriesNegative;


    @Given("I set a GET product category endpoints")
    public void setGetCategoriesEndpoints(){getAllCategoriesPositive.setGetCategoriesEndpoints();}
    @When("I send category HTTP GET request")
    public void categoriesGetHTTPRequest(){getAllCategoriesPositive.categoriesGetHTTPRequest();}
    @Then("I receive a valid category HTTP response code 200 OK")
    public void HTTPCategoriesResponse200(){getAllCategoriesPositive.HTTPCategoriesResponse200();}
    @And("I received valid data for all product category details")
    public void validCategoriesData(){getAllCategoriesPositive.validCategoriesData();}

    @Given("I set a GET invalid product category endpoints")
    public void setInvalidCategoryEndpoints(){getAllCategoriesNegative.setInvalidCategoryEndpoints();}
    @When("I send categories HTTP GET request")
    public void categoriesHTTPGetRequest(){getAllCategoriesNegative.categoriesHTTPGetRequest();}
    @Then("I receive a valid category HTTP response code 404 Not Found")
    public void HTTPCategoriesResponse404(){getAllCategoriesNegative.HTTPCategoriesResponse404();}
    @And("I didn't received valid data for all product category details")
    public void emptyCategoriesData(){getAllCategoriesNegative.emptyCategoriesData();}

    @Given("I set a GET valid categories endpoints by ID 12513")
    public void setValidIDCategoryEndpoints(){getCategoriesByIDPositive.setValidIDCategoryEndpoints();}
    @When("I send a GET request to the valid categories endpoint")
    public void IDCategoryGetRequest(){getCategoriesByIDPositive.IDCategoryGetRequest();}
    @Then("I receive valid HTTP response code 200 OK for the categories endpoint")
    public void HTTPIDCategoryResponse200(){getCategoriesByIDPositive.HTTPIDCategoryResponse200();}
    @And("I received valid data for single product categories by ID 12513")
    public void validDataIDCategory(){getCategoriesByIDPositive.validDataIDCategory();}

    @Given("I set a GET invalid categories endpoints by ID 1")
    public void setInvalidIDCategoriesEndpoint(){getCategoriesByIDNegative.setInvalidIDCategoriesEndpoint();}
    @When("I send a GET request to the invalid categories endpoint")
    public void IDCategoriesHTTPGETRequest(){getCategoriesByIDNegative.IDCategoriesHTTPGETRequest();}
    @Then("I receive valid HTTP response code 404 Not Found for the categories endpoint")
    public void IDCategoriesGetResponse404(){getCategoriesByIDNegative.IDCategoriesGetResponse404();}
    @And("I didn't received valid data for single product categories details by ID 1")
    public void emptyDataIDCategories(){getCategoriesByIDNegative.emptyDataIDCategories();}

    @Given("I set DELETE product categories endpoints by ID 11349")
    public void setDeleteValidEndpoint(){deleteSingleCategoriesPositive.setDeleteValidEndpoint();}
    @When("I send DELETE HTTP request for the categories endpoint")
    public void categoryDeleteHttpRequest(){deleteSingleCategoriesPositive.categoryDeleteHttpRequest();}
    @Then("I receive valid DELETE HTTP response code 200 OK for the categories endpoint")
    public void validHttpDeleteResponse200(){deleteSingleCategoriesPositive.validHttpDeleteResponse200();}

    @Given("I set DELETE invalid product categories endpoints by ID 11349")
    public void setDeleteInvalidEndpoint(){deleteSingleCategoriesNegative.setDeleteInvalidEndpoint();}
    @When("I send DELETE HTTP request for categories endpoint")
    public void categoryDeleteRequest(){deleteSingleCategoriesNegative.categoryDeleteRequest();}
    @Then("I didn't receive valid DELETE HTTP response code 404 Not Found for the categories endpoint")
    public void validHttpDeleteResponse404(){deleteSingleCategoriesNegative.validHttpDeleteResponse404();}

}
