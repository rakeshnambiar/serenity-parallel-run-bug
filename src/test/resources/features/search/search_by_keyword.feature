Feature: Search by keyword

  @TC01_CucumberTest
  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

  @TC02_CucumberTest
  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he looks up "Apple"
    Then he should see information about "Apple"