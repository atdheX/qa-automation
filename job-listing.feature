Feature: Observe Job Listing Action

  Scenario: As a non login User, I want to see job opportunity at labcorp.com
    Given the user is on the Home Page
    When he click on Career Menu
    And search for "QA Automation Developer"
    And select the result that match with the input
    Then job title should be "QA Test Automation Developer"
    And job location is at "Durham, North Carolina, United States of America"
    And job id is "21-90223_RM"
    And the second bullet point of Management Support is "Prepare test plans, budgets, and schedules."
    And the third point of the Requirements is "5+ years of experience in QA automation development and scripting."
    And the first suggested automation tools is "Selenium"
    When he click Apply Now
    Then he asked to login first

