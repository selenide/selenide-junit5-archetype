package ${package}.pagewidgets;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchResults {
  public final ElementsCollection found = $$("#ires .g");

  public SelenideElement getResult(int index) {
    return found.get(index);
  }
}
