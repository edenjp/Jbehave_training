package calculator.com;
import org.jbehave.core.annotations.*;
import org.junit.Assert;

public class Calculator {
    private char sign;
    private long number1;
    private long number2;
    private long result;

    @Given("a calculator class with the operation sign as <sign>")
    public void givenACalculatorClassWithTheOperationSignAssign(@Named("sign") String sign) {
        this.sign = sign.charAt(0);

        switch (this.sign) {
            case '+':
                System.out.println("Addition operation");
                break;
            case '-':
                System.out.println("Subtraction operation");
                break;
            case '*':
                System.out.println("Multiplication operation");
                break;
            case '/':
                System.out.println("Division operation");
                break;
            default:
                System.out.println("Please give a valid operation");


        }
    }

    @When("I give the first number as <number1>")
    public void whenIGiveTheFirstNumberAsnumber1(@Named("number1") long number1) {
        this.number1 = number1;
    }

    @When("I give the second number as <number2>")
    public void whenIGiveTheSecondNumberAsnumber2(@Named("number2") long number2) {
        this.number2 = number2;
    }

    @Then("I should get the result as <result>")
    public void thenIShouldGetTheResultAsresult(@Named("result") long result) {
        Operation operation = new Operation();

        switch (this.sign) {
            case '+':
                this.result = operation.addition(this.number1, this.number2);
                Assert.assertEquals(this.result, result);
                break;
            case '-':
                this.result = operation.subtraction(this.number1, this.number2);
                Assert.assertEquals(this.result, result);
                break;
            case '*':
                this.result = operation.multiplication(this.number1, this.number2);
                Assert.assertEquals(this.result, result);
                break;
            case '/':
                this.result = operation.division(this.number1, this.number2);
                Assert.assertEquals(this.result, result);
                break;
            default:
                System.out.println("Please give a valid operation");
        }
    }
}
