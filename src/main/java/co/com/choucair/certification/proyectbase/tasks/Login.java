package co.com.choucair.certification.proyectbase.tasks;

import co.com.choucair.certification.proyectbase.userinterface.ChoucairAcademyLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairAcademyLoginPage.LOGIN_BUTTON),
                Enter.theValue("1098783745").into(ChoucairAcademyLoginPage.INPUT_USER),
                Enter.theValue("Choucair2021*").into(ChoucairAcademyLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairAcademyLoginPage.ENTER_BUTTON)
        );

    }
}
