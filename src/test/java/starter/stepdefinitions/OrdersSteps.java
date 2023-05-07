package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Orders.GetAllOrdersPositive;

public class OrdersSteps {
    @Steps
    GetAllOrdersPositive getAllOrdersPositive;

    @Given("I set a GET order endpoints")
    public void setOrdersEndpoints(){getAllOrdersPositive.setOrdersEndpoints();}
    @When("I send HTTP GET request for order endpoint")
    public void orderGetHTTPrequest(){getAllOrdersPositive.orderGetHTTPrequest();}
    @Then("I receive a valid HTTP response code 200 OK for order endpoint")
    public void HTTPOrderResponse200(){getAllOrdersPositive.HTTPOrderResponse200();}
    @And("I received valid data for all order details")
    public void validOrderData(){getAllOrdersPositive.validOrderData();}
}
