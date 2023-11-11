package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;

public class RegistroStepDefinitionRegistro {

    @After
    public void main() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("estos es el inicio")
    public void estosEsElInicio() {

    }

    @When("ejecuta la prueba")
    public void ejecutaLaPrueba() {

    }

    @Then("valida el resultado")
    public void validaElResultado() {

    }


}
