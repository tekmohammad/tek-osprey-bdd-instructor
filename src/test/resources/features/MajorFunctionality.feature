#Author: Mohammad Shokriyan
Feature: Retail App Major Functionality

  Scenario: Validate landing page top left corner title
    Given Open Browser and Navigate to retail app
    Then Validate top left corner is "TEKSCHOOL"
    Then Close Browser

  Scenario: Validate Sign In button is Enabled
    Given Open Browser and Navigate to retail app
    Then Validate Sign In Button is Enabled
    Then Close Browser