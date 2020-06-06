package tests;

        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.logevents.SelenideLogger;
        import io.qameta.allure.Description;
        import io.qameta.allure.Epic;
        import io.qameta.allure.Story;
        import io.qameta.allure.selenide.AllureSelenide;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Tag;
        import org.junit.jupiter.api.Test;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selectors.byName;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;


        @Epic("QA.GURU automation course")
        @Story("Mail.ru regger")
        @Tag("regger")
        public class mailru_regger {

       @BeforeEach
//        void beforeEach() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
//        Configuration.remote = "http://" + System.getProperty("selenoid_url") + ":4444/wd/hub/";
//        }

       public void initSelenideListener() {
           SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true));
       }
        @Test
        @Description("Registration emails")
        @DisplayName("Register new email accs")
        void mailru_regger() {
        open("https://mail.ru");



        }



 }