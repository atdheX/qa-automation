Feature: Get the employee details

  Scenario: As a non login User, I want to get list of the employee
    When a list of the employee are available
    Then the first employee name is "employee_firstname 32"
    And his phone number is "665-796-0753"
    And the employee id is "32"

  Scenario: As a non login User, I want to submit a new employee
    When he submit the new employee
    Then the status code should be "400"
    And the error message is "Max number of elements reached for this resource!"
