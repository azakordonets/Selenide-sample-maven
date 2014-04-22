import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleSearchTest {

    @Test
    public void testSearch()
    {
        open("http://google.com");
        $(By.id("gbqfq")).setValue("biercoff.com");
        $(By.id("gbqfq")).sendKeys(Keys.ENTER);
        $(By.linkText("Andrew Zakordonets")).click();
        $(By.cssSelector(".panel-cover__title.panel-title>a")).shouldHave(text("Andrew Zakordonets"));
    }


}
