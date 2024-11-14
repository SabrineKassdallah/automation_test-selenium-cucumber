Feature: Ebay Home Page Scenarios

  @P1 @P2
  Scenario: Advanced Search Link

    Given I am on Eaby Home Page
    When I click on Advanced
    Then I navigate to Advanced Search page


  @P1 @setCookies @Test
  Scenario: Search items count
    Given I am on Eaby Home Page
    When I search for "iphone 11"
    Then I validate atleast 1000 search items present

  @P24 @setCookies
  Scenario: Search items count2
    Given I am on Eaby Home Page
    When I search for "Tay Cars"
    Then I validate atleast 100 search items present

  @P240 @setCookies
  Scenario: Search an item in category
    Given I am on Eaby Home Page
    When I search for "soap" in "Baby" category

  @P500
  Scenario Outline: Home page links
    Given I am on Eaby Home Page
    When  I click on '<link>'
    Then  I validate that page navigates to '<url>' and title contains '<title>'

    Examples:
      | link    | url                                                                | title                      |
      | Motors  |  https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479      | Buy Auto Parts             |
      | Fashion | https://www.ebay.com/b/Fashion/bn_7000259856                       | Fashion products           |
      | Sports  | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031               | Sporting Goods  |