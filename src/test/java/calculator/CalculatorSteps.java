package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.calculator.add();
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyArgAndArg(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.calculator.multiply();
    }

    @When("I divide {int} by {int}")
    public void iDivideArgByArg(int arg0, int arg1) {
        
    }

    @Then("an error should be displayed")
    public void anErrorShouldBeDisplayed() {
    }
}
