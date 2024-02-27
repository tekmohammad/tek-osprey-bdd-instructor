Feature: Small Description about the Functionality

  Scenario: Test Case Description (Go to School)
    Given Get ready prepare to drive
    When Drive to School
    Then Arrive to school


  Scenario Outline: Going to Mall for shopping.
    Given Get ready prepare to drive
    When Driver to "<places>"
    Then Arrive to "<places>"

    #First Row is Column Name
    Examples:
      | places        |
      | Shopping Mall |
      | School        |
      | Starbucks     |
      | Library       |
      | Work          |
