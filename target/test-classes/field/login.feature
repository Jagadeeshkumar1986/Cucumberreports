Feature: verify facebook details

  Scenario Outline: verify the login details
    Given user is on facebook page
    When user enters "<username>" and "<password>"
    Then user should click login button

    Examples: 
      | username | password |
      | jaga     |      567 |
      | kumar    |      987 |
      | jack     |      345 |
