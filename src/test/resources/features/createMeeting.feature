Feature: Meeting creation

  Background:
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
      | username | password |
      | <username>  | <password> |
    Examples:
      | username | password |
      | admin | serenity |

  Scenario Outline: Successful creation of a new meeting
    When the user attempts to create a new meeting
        | name | type | number | startDate | endDate | location | businessUnit |  organizedBy | reporter |
        | <name> | <type> | <number> | <startDate> | <endDate> | <location> | <businessUnit> | <organizedBy> | <reporter> |
    Then the user see the new meeting <name> on the list
    Examples:
        | name | type | number | startDate | endDate | location | businessUnit |  organizedBy | reporter |
        | Angey | Customer | 0001 | 05/11/2024 10:30 | 05/11/2024 11:30 | On Site | Administration | Aaron Taylor | Aaron Taylor |