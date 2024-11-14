Feature: Ebay Advanced Search Page

  @P24
  Scenario: Ebay Logo on Advanced Search Page

    Given I am on Advanced Search Page
    When I click on Ebay Logo
    Then I navigate to Ebay Home Page

  @P300
  Scenario:  Advanced Search an item

    Given I am on Advanced Search Page
    When I advanced search an item
      |keyword| exclude   |min|max|
      |iPhone11|refurbished|300|900|