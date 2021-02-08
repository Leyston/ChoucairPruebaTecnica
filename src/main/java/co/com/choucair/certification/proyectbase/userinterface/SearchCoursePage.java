package co.com.choucair.certification.proyectbase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target LINK_SEARCH = Target.the("link to the search page")
            .located(By.xpath("//div[@id= 'certificaciones']//a[@class ='card_index']"));
    public static final Target INPUT_SEARCH = Target.the("where to write the course to search")
            .located(By.id("coursesearchbox"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm search")
            .located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target LINK_COURSE = Target.the("link to the course page")
            .located(By.xpath("//a[contains(text(),'Prueba Técnica - Analista Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Prueba Técnica - Analista Bancolombia')]"));
}
