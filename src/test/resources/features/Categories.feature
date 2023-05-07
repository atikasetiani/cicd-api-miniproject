  Feature: Categories

    Scenario: As admin I get confirm response 200 & all product category details when using a valid baseURL
      Given I set a GET product category endpoints
      When I send category HTTP GET request
      Then I receive a valid category HTTP response code 200 OK
      And I received valid data for all product category details

    Scenario: As admin I get confirm response 404 & can't get all product category details when using a valid baseURL
      Given I set a GET invalid product category endpoints
      When I send categories HTTP GET request
      Then I receive a valid category HTTP response code 404 Not Found
      And I didn't received valid data for all product category details

    Scenario: As admin I get confirm response 200 & single product category details when using a valid id
      Given I set a GET valid categories endpoints by ID 12513
      When I send a GET request to the valid categories endpoint
      Then I receive valid HTTP response code 200 OK for the categories endpoint
      And I received valid data for single product categories by ID 12513

    Scenario: As admin I get confirm response 404 & single product category details when using a invalid id
      Given I set a GET invalid categories endpoints by ID 1
      When I send a GET request to the invalid categories endpoint
      Then I receive valid HTTP response code 404 Not Found for the categories endpoint
      And I didn't received valid data for single product categories details by ID 1

    Scenario: As admin, I can delete any of the existing product categories when using a valid baseURL
      Given I set DELETE product categories endpoints by ID 11349
      When I send DELETE HTTP request for the categories endpoint
      Then I receive valid DELETE HTTP response code 200 OK for the categories endpoint

    Scenario: As admin, I can't delete any of the existing product categories when using a invalid baseURL
      Given I set DELETE invalid product categories endpoints by ID 11349
      When I send DELETE HTTP request for categories endpoint
      Then I didn't receive valid DELETE HTTP response code 404 Not Found for the categories endpoint