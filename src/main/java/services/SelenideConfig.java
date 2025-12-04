package services;
import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;


public class SelenideConfig {

    public static void setup(){
            Configuration.browser = ReadProperties.browserName();
            Configuration.baseUrl = ReadProperties.getUrl();

    }

}
