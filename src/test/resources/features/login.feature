Feature: Successful login on serenity's  website
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    | username | password |
    | <username>  | <password> |
    Then the user should see the <title> page
    Examples:
      | username | password | title |
      | admin | serenity | Dashboard |