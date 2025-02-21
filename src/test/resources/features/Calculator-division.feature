Feature: Dividing numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to divide numbers using a Calculator

  Scenario Outline: Divide two numbers
    Given I have a Calculator
    When I divide <arg0> by <arg1>
    Then the result should be <res>
    Examples:
      | arg0 | arg1 | res        |
      | 10   | 2    | 5          |
      | 9    | 3    | 3          |
      | -6   | 2    | -3         |
      | 7    | -1   | -7         |
      | 0    | 5    | 0          |

  Scenario: Divide by zero
    Given I have a Calculator
    When I divide 10 by 0
    Then an error should be displayed