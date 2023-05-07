package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Products.*;

public class ProductsSteps {
    @Steps
    GetAllProductsPositive getAllProductsPositive;
    @Steps
    GetAllProductsNegative getAllProductsNegative;
    @Steps
    GetProductByIDPositive getProductByIDPositive;
    @Steps
    GetProductByIDNegative getProductByIDNegative;
    @Steps
    DeleteProductsPositive deleteProductsPositive;
    @Steps
    DeleteProductsNegative deleteProductsNegative;
    @Steps
    GetRatingProductsPositive getRatingProductsPositive;
    @Steps
    GetRatingProductsNegative getRatingProductsNegative;
    @Steps
    GetCommentProductsPositive getCommentProductsPositive;
    @Steps
    GetCommentProductsNegative getCommentProductsNegative;


    @Given("I set a GET endpoints")
    public void setGetEndpoints(){getAllProductsPositive.setGetEndpoints();}
    @When("I send HTTP GET request")
    public void getHTTPrequest(){getAllProductsPositive.getHTTPrequest();}
    @Then("I receive a valid HTTP response code 200 OK")
    public void HTTPresponse200(){getAllProductsPositive.HTTPresponse200();}
    @And("I received valid data for all product details")
    public void valiData(){getAllProductsPositive.valiData();}

    @Given("I set the GET endpoint part")
    public void GetEndpoints(){getAllProductsNegative.GetEndpoints();}
    @When("I send a request to the HTTP GET part")
    public void partGetHTTPRequest(){getAllProductsNegative.partGetHTTPRequest();}
    @Then("I receive a valid HTTP response code 404 Not Found")
    public void HTTPresponse404(){getAllProductsNegative.HTTPresponse404();}
    @And("I didn't received valid data for all product details")
    public void emptyData(){getAllProductsNegative.emptyData();}

    @Given("I set a GET endpoints by ID 13374")
    public void setGetIDEndpoints(){getProductByIDPositive.setGetIDEndpoints();}
    @When("I send HTTP GET to the request")
    public void getIDHTTPrequest(){getProductByIDPositive.getIDHTTPrequest();}
    @Then("I receive valid HTTP response code 200 OK")
    public void HTTPGetResponse200(){getProductByIDPositive.HTTPGetResponse200();}
    @And("I received valid data for single product details by ID 13374")
    public void valiDataID(){getProductByIDPositive.valiDataID();}

    @Given("I set a GET endpoints by ID 112")
    public void setIDEndpoints(){getProductByIDNegative.setIDEndpoints();}
    @When("I sending HTTP GET request")
    public void HTTPGETRequest(){getProductByIDNegative.HTTPGETRequest();}
    @Then("I receive valid HTTP response code 404 Not Found")
    public void HTTPGetResponse404(){getProductByIDNegative.HTTPGetResponse404();}
    @And("I didn't received valid data product details by ID 112")
    public void emptyDataID(){getProductByIDNegative.emptyDataID();}

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        deleteProductsPositive.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){deleteProductsPositive.sendDeleteHttpRequest();}
    @Then("I receive valid DELETE HTTP response code 200 OK")
    public void validHttpresponseCode200(){deleteProductsPositive.validHttpresponseCode200();}

    @Given("I set DELETE endpoints is wrong")
    public void setDeleteWrongEndpoint(){deleteProductsNegative.setDeleteWrongEndpoint();}
    @When("I send DELETE HTTP request for endpoints")
    public void sendHTTPDeleteRequest(){deleteProductsNegative.sendHTTPDeleteRequest();}
    @Then("I receive valid DELETE HTTP response code 404 Not Found")
    public void validHttpresponseCode404(){deleteProductsNegative.validHttpresponseCode404();}

    @Given("I set a GET rating endpoints")
    public void setGetRatingEndpoints(){getRatingProductsPositive.setGetRatingEndpoints();}
    @When("I send a HTTP GET to the request")
    public void HTTPGetRequest(){getRatingProductsPositive.HTTPGetRequest();}
    @Then("I receive valid HTTP response code is 200 OK")
    public void HTTPResponse200(){getRatingProductsPositive.HTTPResponse200();}
    @And("I received valid data for rating product")
    public void valiDataRating(){getRatingProductsPositive.valiDataRating();}

    @Given("I set GET invalid rating endpoints")
    public void GetInvalidRatingEndpoints(){getRatingProductsNegative.GetInvalidRatingEndpoints();}
    @When("I send GET to HTTP request")
    public void ratingGetHTTPRequest(){getRatingProductsNegative.ratingGetHTTPRequest();}
    @Then("I receive valid rating HTTP response code 404 Not Found")
    public void HTTPRatingResponse404(){getRatingProductsNegative.HTTPRatingResponse404();}
    @And("I didn't received valid data for rating product")
    public void emptyRatingData(){getRatingProductsNegative.emptyRatingData();}

    @Given("I set a GET comment endpoints")
    public void setValidCommentEndpoints(){getCommentProductsPositive.setValidCommentEndpoints();}
    @When("I send a HTTP GET request for comment products")
    public void commentGetHTTPRequest(){getCommentProductsPositive.commentGetHTTPRequest();}
    @Then("I receive valid comment HTTP response code is 200 OK")
    public void HTTPCommentResponse200(){getCommentProductsPositive.HTTPCommentResponse200();}
    @And("I received valid data for comment products")
    public void validCommentData(){getCommentProductsPositive.validCommentData();}

    @Given("I set GET invalid comment endpoints")
    public void GetInvalidCommentEndpoints(){getCommentProductsNegative.GetInvalidCommentEndpoints();}
    @When("I send HTTP GET request for comment products")
    public void commentHTTPGetRequest(){getCommentProductsNegative.commentHTTPGetRequest();}
    @Then("I receive valid comment HTTP response code is 404 Not Found")
    public void HTTPCommentResponse404(){getCommentProductsNegative.HTTPCommentResponse404();}
    @And("I didn't received valid data for comment products")
    public void emptyCommentData(){getCommentProductsNegative.emptyCommentData();}

}
