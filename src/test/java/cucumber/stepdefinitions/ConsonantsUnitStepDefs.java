package cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import com.exercise.ConsonantsCount;

import io.cucumber.java.en.Then;

public class ConsonantsUnitStepDefs {
    private ConsonantsCount consonantsCount;
    private int count;

    @Given("I have a VowelCounter over {string}")
    public void i_have_a_VowelCounter_over(String str) {
        this.consonantsCount = new ConsonantsCount(str);
    }

    @When("I call getConsonantsCount")
    public void i_call_getConsonantsCount() {
        this.count = this.consonantsCount.getConsonantsCount();
    }

    @Then("the output result should be {int}")
    public void the_output_result_should_be(int expectedResult) {
        assertEquals(this.count, expectedResult);
    }
}