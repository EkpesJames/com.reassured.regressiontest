Feature: Life Quote Module
  As a life insurance prospect
  I want to be able to get life insurance quotes
  So that I can decide what provider to choose from

  Scenario Outline: User can search for quotes
    Given user is on the home page
    When user clicks Get Quote button
    And I select just myself option
    And I enter "<Firstname>" and "<Surname>" details
    And I select date of birth day
    And I select date of birth month
    And I select date of birth year
    And I select smoked as No
    And I select type of cover as level of term
    And I enter "<Years>" as terms
    And I enter sum "<SumAssured>" as sum assured
    And I select yes to critical illness Additional
    And I enter "<Amount>" as Critical Illness cover amount
    And I enter "<Email>" as email address
    And I enter "<PhoneNumber>" as phone number
    And I enter "<HouseNumber>" as house number
    And I enter "<PostalCode>" as post code
    And I click find address
    And I select Do not contact for Contact Preference
    And I tick confirm for the legal bit
    And I click Get your quotes button
    And I capture quote summary
    And I remove critical illness
    Then the result is updated

    Examples: Quote Test Data
      | Firstname | Surname | Years | SumAssured | Amount | Email                   | PhoneNumber | HouseNumber | PostalCode |
      | Insurance | Quote   | 20    | 250000     | 15000  | widecem309@mailreds.com | 07812120038 | 7           | RG1 6NY    |