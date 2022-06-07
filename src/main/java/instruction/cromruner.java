package instruction;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class cromruner {
    @BeforeTest
    public void setup(){
        Selenide.open("https://www.google.ge/");
        Configuration.browserSize = "1920x1080";

    }
}
