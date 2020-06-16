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
        import org.openqa.selenium.By;

        import static com.codeborne.selenide.Condition.exist;
        import static com.codeborne.selenide.Condition.visible;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.*;
        import static helpers.Environment.mailruUrl;
        import static io.qameta.allure.Allure.step;
        import static utils.RandomUtils.*;

@Epic("QA.GURU automation course")
        @Story("Mail.ru regger")
        @Tag("regger")
        @Feature("Check 1st step account registration mail.ru - CAPTCHA test")
public class MailruRegger extends TestBase {

    @Test
    @Description("Registration emails")
    @DisplayName("Register new email account")
    void successfulReg() {
        step("Go to mail.ru and check homepage", () -> {
            open(mailruUrl);
            $("#signup").shouldBe(visible);

        });

        step("Fill form and register", () -> {
                    $("#signup").click();
                    switchTo().window(1);
                    $("button[type='submit']").shouldBe(visible);
                });

        step("Enter First and Last name", () -> {
                    String randomName = getRandomName(6);
                    $("#fname").setValue(randomName);
                    String randomLastName = getRandomName(7);
                    $("#lname").setValue(randomLastName);
         });

        step("Enter birthday", () -> {
                $(by("data-test-id","birth-date__day")).click();
                int randomDay = getRandomInt(1, 28);
                $(by("data-test-id", "select-value:" + randomDay)).click();
         });

        step("Enter birthday month", () -> {
            $(by("data-test-id","birth-date__month")).click();
            int randomMonth = getRandomInt(1, 12);
            $(by("data-test-id", "select-value:" + randomMonth)).click();
        });

        step("Enter birthday year", () -> {
            $(by("data-test-id","birth-date__year")).click();
            int randomYear = getRandomInt(1950, 2000);
            $(by("data-test-id", "select-value:" + randomYear)).click();
        });

        step("Set random Gender checkbox", () -> {
            int genderInputIndex = getRandomInt(0, 1);
            $(by("data-test-id", "gender-form-field-inner"))
                    .$("label", genderInputIndex).click();
//            $("[data-test-id='gender-form-field-inner'] label", genderInputIndex).click();
        });

        step("Set login email", () -> {
            $("#aaa__input").setValue("gfgdfggewgfdg");
        });

        step("Set random password", () -> {
            String randomPass = getRandomPass(8);
            $("#password").setValue(randomPass);
            $("#repeatPassword").setValue(randomPass);
        });

        step("Click to no phone", () -> {
        $(by("data-test-id","phone-number-switch-link")).click();
        });

        step("Click Register button", () -> {
            $(by("data-test-id","first-step-submit")).click();
        });

        step("Check CAPTCHA image", () -> {
            $(by("data-test-id","captcha-image")).shouldBe(visible);
        });
        
        sleep(10000);


    }
}