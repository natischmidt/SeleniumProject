Feature: User Account Creation

  Scenario: Create user - all goes as expected and an account is created
    Given I am on the account creation page
    When I fill in all required fields correctly
    And I submit the form
    Then I should see a confirmation message

  Scenario: Create user - last name is missing
    Given I am on the account creation page
    When I fill in all required fields except the last name
    And I submit the form
    Then I should see an error message for the last name

  Scenario: Create user - passwords do not match
    Given I am on the account creation page
    When I fill in all required fields with mismatched passwords
    And I submit the form
    Then I should see an error message for password mismatch

  Scenario: Create user - terms and conditions not accepted
    Given I am on the account creation page
    When I fill in all required fields except accepting terms and conditions
    And I submit the form
    Then I should see an error message for terms and conditions