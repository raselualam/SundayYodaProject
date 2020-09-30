@ApiTesting @regression
Feature: App user should able to create, update, get and delete employee record through API.

  Scenario Outline: Talentech has multiple employee records
    Given Create new employee record "<Name>", "<Salary>" and "<Age>" in database
    And Update an employee Salary with "<Increment>"
    When Get all employee data
    And Get a single employee data by id
    Then Delete an employee record

    Examples: 
      | Name | Salary | Age | Increment |
      | Sam  | 120000 |  28 |    135000 |
