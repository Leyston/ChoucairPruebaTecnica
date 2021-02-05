package co.com.choucair.certification.proyectbase.tasks;

import co.com.choucair.certification.proyectbase.userinterface.ChoucairAcademyLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {

        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairAcademyLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairAcademyLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairAcademyLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairAcademyLoginPage.ENTER_BUTTON)
        );

    }
}
