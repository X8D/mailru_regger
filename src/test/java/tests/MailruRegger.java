package tests;

        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.logevents.SelenideLogger;
        import io.qameta.allure.Description;
        import io.qameta.allure.Epic;
        import io.qameta.allure.Feature;
        import io.qameta.allure.Story;
        import io.qameta.allure.selenide.AllureSelenide;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Tag;
        import org.junit.jupiter.api.Test;

        import static com.codeborne.selenide.Condition.exist;
        import static com.codeborne.selenide.Condition.visible;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.*;
        import static io.qameta.allure.Allure.step;
        import static utils.RandomUtils.*;

@Epic("QA.GURU automation course")
        @Story("Mail.ru regger")
        @Tag("regger")
        @Feature("Регистрация аккаунтов mail.ru")
        public class MailruRegger {


//       @BeforeEach
////        void beforeEach() {
////        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
////        Configuration.remote = "http://" + System.getProperty("selenoid_url") + ":4444/wd/hub/";
////        }
//
//       public void initSelenideListener() {
//           SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true));
//       }

        @Test
        @Description("Registration emails")
        @DisplayName("Register new email account")
        void successfulReg() {
            step("Go to mail.ru and check homepage", ()-> {
                open("https://mail.ru");
                $("#signup").shouldBe(visible);

            });

            step("Fill form and register", ()-> {
                $("#signup").click();
                switchTo().window(1);
                $x("//button[@type=\"submit\"]").shouldBe(visible);
                String randomName = getRandomName(6);
                $("#fname").setValue(randomName);
                String randomLastName = getRandomName(7);
                $("#lname").setValue(randomLastName);

                String randomPass = getRandomPass(8);
                $("#password").setValue(randomPass);
                $("#repeatPassword").setValue(randomPass);

            });

sleep(10000);


//            step("Fill the registration form", ()-> {
//                $("#signup").click();
//                $("#first-step-submit").shouldBe(visible);
//                $("#fname").val("fname");
//
//
//                $("Login input").setValue(DEFAULT_LOGIN);
//                $("Password input").setValue(DEFAULT_PASSWORD);
//                $("Remember me checkbox").click();
//                $("Login button").click();
//            });
//
//            step("Verify successful authorization", ()-> {
//                $(byTestId("Authorization form")).shouldNot(exist);
//                $(byTestId("Header label")).shouldHave(text("Hello, Alex!"));
//                $$(byTestId("Private content"))
//                        .shouldHaveSize(2)
//                        .shouldHave(texts("Here is your private content #1", "and private content #2"));
//            });
        }
 }