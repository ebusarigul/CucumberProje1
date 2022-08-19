Feature: Login Functionality

  Background:
    Given Navigate to parabank

  Scenario Outline:valid Login

    When User a username name as "<username>" password as "<password>"
    Then User should login successfuliy
    Examples:
      | username   | password  |
      | ebusarigul | ebu123456 |

 Scenario Outline: invalidLogin

    When User a username name as "<invalidUsername>" password as "<invalidPassword>"
    Then User Sould be able see incorrect usernamepassword
   Examples:
     | invalidUsername | invalidPassword |
     | ebusargl        | dasasfsa2124    |

