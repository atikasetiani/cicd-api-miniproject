Feature: Products

  Scenario: As admin I get confirm response 200 & all product details when using a valid baseURL
    Given I set a GET endpoints
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200 OK
    And I received valid data for all product details

  Scenario: As admin I get confirm response 404 & can't get all product details when using an invalid baseURL
    Given I set the GET endpoint part
    When I send a request to the HTTP GET part
    Then I receive a valid HTTP response code 404 Not Found
    And I didn't received valid data for all product details

  Scenario: As admin I get confirm response 200 & single product details when using a valid id
    Given I set a GET endpoints by ID 13374
    When I send HTTP GET to the request
    Then I receive valid HTTP response code 200 OK
    And I received valid data for single product details by ID 13374

  Scenario: As admin I get confirm response 404 & can't get single product details when using a invalid id
    Given I set a GET endpoints by ID 112
    When I sending HTTP GET request
    Then I receive valid HTTP response code 404 Not Found
    And I didn't received valid data product details by ID 112

  Scenario: As admin I have be able to delete existing when using a valid baseURL
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid DELETE HTTP response code 200 OK

  Scenario: As admin I haven't be able to delete existing product when using an invalid BesURL
    Given I set DELETE endpoints is wrong
    When I send DELETE HTTP request for endpoints
    Then I receive valid DELETE HTTP response code 404 Not Found

  Scenario: As admin I get confirm response 200 & rating product when using a valid BaseURL
    Given I set a GET rating endpoints
    When I send a HTTP GET to the request
    Then I receive valid HTTP response code is 200 OK
    And I received valid data for rating product

  Scenario: As admin I get confirm response 404 & can't get rating product when using an invalid BaseURL
    Given I set GET invalid rating endpoints
    When I send GET to HTTP request
    Then I receive valid rating HTTP response code 404 Not Found
    And I didn't received valid data for rating product

  Scenario: As admin I get confirm response 200 & comment products when using a valid BaseURL
    Given I set a GET comment endpoints
    When I send a HTTP GET request for comment products
    Then I receive valid comment HTTP response code is 200 OK
    And I received valid data for comment products

  Scenario: As admin I get confirm response 404 & can't get comment products when using a invalid BaseURL
    Given I set GET invalid comment endpoints
    When I send HTTP GET request for comment products
    Then I receive valid comment HTTP response code is 404 Not Found
    And I didn't received valid data for comment products





