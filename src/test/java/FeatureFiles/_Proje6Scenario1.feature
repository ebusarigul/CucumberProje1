Feature: Register Functionality

  Scenario: Register and Succes Message Validate
    Given Navigate to parabank
    When Click Register Button
    And fill in registration information and register click
    Then User should be see succes
