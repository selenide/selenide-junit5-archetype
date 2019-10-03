package $package;

import ${package}.pagewidgets.*;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Simple Selenide Test with PageObjects
 */
public class GoogleTest {
    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://google.com/ncr");

        // Act
        SearchResults results = new GoogleSearch().searchFor("selenide");

        // Assert
        results.verifyCount(1);
        results.verifyText(0, "Selenide: concise UI tests in Java");
    }
}
