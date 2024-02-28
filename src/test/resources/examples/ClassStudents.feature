Feature: Class Students Feature File

  # using # we can comment in Feature file.
  # Student name and their Subject and their score
  # Mohammad Shokriyan is in Osprey Class
  # with Subject Automation with Score 80 and result is Passed.

  Scenario: Student result in Subjects.
    Given Student name "Mohammad Shokriyan"
    Given Student class name is "Osprey"
    Given In subject "Automation"
    When Student has 40 scored
    Then Student result is "Failed"


  Scenario Outline: Student result in Subjects.
    Given Student name "<fullName>"
    Given Student class name is "<className>"
    Given In subject "<subject>"
    When Student has <score> scored
    Then Student result is "<result>"

    Examples:
      | fullName          | className | subject        | score | result |
      | Zuhal Niazi       | Osprey    | Automation     | 80    | Passed |
      | Mansoor Stanikzai | Osprey    | Selenium       | 70    | Passed |
      | John Smith        | Knights   | API Automation | 49    | Failed |


