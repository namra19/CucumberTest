@Ikea-Order-Journey
Feature: Acceptance Testing to validate that the user can login successfully
 Background:

   Given I am on home page "https://www.ikea.com/nl/en/" of ikea website
   When I click on the user icon I am redirected to login page

  @Login-Positive

  Scenario: Validate Login page with valid data

    And I enter email as "tautomation265@gmail.com"
    And I enter password as "Qwerty@12"
    And I click on Login button
    Then I should see the message as "Hello Test!"

  @Login-Negative

    Scenario: Validate Login page with invalid data

      And I enter email as "tautomation@gmail.com"
      And I enter password as "Qwerty@1"
      And I click on Login button
      Then I should see the message as "Hello Test!"

