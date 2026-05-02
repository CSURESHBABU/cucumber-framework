Feature: Shopping page search functionality check

  Scenario: Product search functionality check in shopping page
    Given Land on GreenKart shopping page
    When Search with "Tom" shortname and get the product name
    Then Validate the product name and compare


  Scenario: Product search functionality on deals page
    Given Land on deals page
    When Search with "Tom" shortname and get the product name
    Then Validate the product name and compare on deals page

