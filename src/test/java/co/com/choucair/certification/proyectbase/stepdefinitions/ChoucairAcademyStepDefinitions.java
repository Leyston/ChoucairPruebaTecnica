package co.com.choucair.certification.proyectbase.stepdefinitions;

import co.com.choucair.certification.proyectbase.questions.Answer;
import co.com.choucair.certification.proyectbase.tasks.Login;
import co.com.choucair.certification.proyectbase.tasks.OpenUp;
import co.com.choucair.certification.proyectbase.tasks.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than alex wants to learn automation at the academy Choucair$")
    public void thanAlexWantsToLearnAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("alex").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }
    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
