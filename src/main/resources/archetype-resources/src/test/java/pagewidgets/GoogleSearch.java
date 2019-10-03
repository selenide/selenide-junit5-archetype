package ${package}.pagewidgets;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearch {
  private SelenideElement searchField = $(byName("q"));

  public SearchResults searchFor(String text) {
    searchField.setValue(text).pressEnter();
    return new SearchResults();
  }
}
