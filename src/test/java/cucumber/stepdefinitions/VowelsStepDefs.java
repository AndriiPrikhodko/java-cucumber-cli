package cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class VowelsStepDefs {
    private Process process;
    private ByteArrayOutputStream output;
    private String program = "agile_qa_interview_exercise.jar";
    private String path;
    @Given("I have a compiled Jar program")
    public void i_have_a_compiled_Jar_program() {
        try {
            this.path = new java.io.File(".").getCanonicalPath();
            File file = new File(this.path + "/" + this.program);
            assertEquals(file.exists(), true);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @When("I run the program with arguments {string}")
    public void i_run_the_program_with_arguments(String args) {
        try {
            PrintStream oldOut = System.out;
            output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));

            String[] command = {"java", "-jar", this.path + "/" + this.program};
            String[] arrayArgs = args.split(" ");
            String[] completeCommand = new String[command.length + arrayArgs.length];
            System.arraycopy(command, 0, completeCommand, 0, command.length);
            System.arraycopy(arrayArgs, 0, completeCommand, command.length, arrayArgs.length);

            ProcessBuilder processBuilder = new ProcessBuilder(completeCommand);
            this.process = processBuilder.start();
            InputStream in = process.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            System.setOut(oldOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("the program should exit with code {int}")
    public void the_program_should_exit_with_code(int exitCode) {
        try {
            this.process.waitFor();
            Assert.assertEquals(exitCode, this.process.exitValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the program output should contain {string}")
    public void the_program_output_should_contain(String expectedOutput) {
        String actualOutput = this.output.toString();
        assertEquals(expectedOutput, actualOutput.strip());
    }
}