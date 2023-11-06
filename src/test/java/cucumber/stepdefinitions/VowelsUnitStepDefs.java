package cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.exercise.VowelCounter;
import com.exercise.CountResult;

import io.cucumber.java.en.Then;

public class VowelsUnitStepDefs {
    private VowelCounter vowelCounter;
    private List<CountResult> result;

    @Given("I have a VowelCounter$")
    public void i_have_a_VowelCounter() {
        this.vowelCounter = new VowelCounter();
    }

    @When("I passed arguments to getVowelListWithCount {string}")
    public void i_passed_arguments_to_getVowelListWithCount(String args) {
        String[] arrArgs = args.split(" ");
        this.result = this.vowelCounter.getVowelListWithCount(arrArgs);
    }

    @Then("the output result should be {string}")
    public void the_output_result_should_be(String expectedResult) {
        String actualResult = this.result.toString();
        assertEquals(actualResult, expectedResult);
    }

    @Then("the output result is null")
    public void the_output_result_is_null() {
        assertEquals(this.result, null);
    }
}