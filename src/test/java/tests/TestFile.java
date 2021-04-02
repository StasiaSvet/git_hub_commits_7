package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestFile {
    @Test
    void testFile() {
        open("https://github.com/StessyT/git_hub_commits_6");
        $(".UnderlineNav-body").shouldHave(text("Code"));
        $(byText("Code")).click();
        $(".ml-md-3").shouldHave(text("1 commit"));
    }
}
