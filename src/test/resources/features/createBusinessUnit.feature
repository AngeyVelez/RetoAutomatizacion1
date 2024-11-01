Feature: BusinessUnit creation

  Background:
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
      | username | password |
      | <username>  | <password> |
    Examples:
      | username | password |
      | admin | serenity |

    Scenario Outline: Successful creation of a business unit
      When the user attempts to create a business unit
        | business | unitName |
        | <business> | <unitName> |
      Then the user see the <unitName> unit on the list
      Examples:
        | business | unitName |
        | Administration | Armenia |