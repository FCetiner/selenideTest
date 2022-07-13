import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;
public class HomeTest {

    @Test
    public void testPageUrlAndTitle() {
        open("https://automationbro.com/");
        String url=WebDriverRunner.url();
        assertEquals(url,"https://automationbro.com/");
        String title=title();
        assertEquals(title,"Automation Bro - Begin Your Test Automation Journey Today");
    }
}
