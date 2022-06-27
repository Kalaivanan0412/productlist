@tag
Feature: login to the webpage

  Background: background session
    Given user is in homepage

  @tag1
  Scenario: sign up with valid data
    When user enter valid Username"<username>" and "<password>"
    Then validation message appears

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to create product name <abcd>
    When find out the model<123>
    Then insert the product image

    Examples: 
      | username | password  | product name | model |
      | admin    | Admin@123 | abcd         |   123 |

  @add_product_list
  Scenario: Add the product with name, image and cancel
    Given User on the add product page using with the url and credentials
    When Add the product name
    Then clicking on back icon, it should not be add any product in the product list
