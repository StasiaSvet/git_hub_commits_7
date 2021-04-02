package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestFile {
    @Test
    void testFile() {
        open("https://github.com/StessyT/git_hub_commits_6");

        System.out.println("Hello, world");
    }
}
