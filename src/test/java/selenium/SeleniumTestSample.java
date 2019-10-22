package selenium;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(SeleniumExtension.class)
class SeleniumTestSample {

    @Test
    void projectIsConfigured(ChromeDriver driver) {
        System.out.println("Test runned....");
    }
}