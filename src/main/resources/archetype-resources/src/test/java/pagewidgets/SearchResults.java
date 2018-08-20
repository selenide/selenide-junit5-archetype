package ${package}.pagewidgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResults {

  private ElementsCollection found = $$("#ires .g");

  public void verifyCount(int atLeast) {
    found.shouldHave(sizeGreaterThan(atLeast));
  }

  public SelenideElement verifyText(int index, String expectedText) {
    return found.get(index).shouldHave(text(expectedText));
  }
}
