package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.item;
import static helpers.Environment.url2;

@Epic("QA.GURU automation course")
@Story("Yandex tests")
@Tag("yandex")
class YandexTests extends TestBase {

    @Test
    @Description("Search item in list")
    void CheckItemCanBeFound() {
        open(url2);

        $("#header-search").val(item).pressEnter();
        $(byPartialLinkText(item)).shouldBe(visible).click();
        switchTo().window(1);

        $("html").shouldHave(text(item));
    }

}