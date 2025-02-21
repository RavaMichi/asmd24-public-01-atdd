Feature: Multiplying numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to multiply numbers using a Calculator

  Scenario Outline: Multiply two numbers
    Given I have a Calculator
    When I multiply <arg0> and <arg1>
    Then the result should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 1   |
      | 19   | 0    | 0   |
      | -5   | 6    | -30 |
      | 5    | -6   | -30 |