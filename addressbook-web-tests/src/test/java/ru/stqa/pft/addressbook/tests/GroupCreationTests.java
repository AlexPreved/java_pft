package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


  @Test
  public void groupCreationTests() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation(); //appManager обращается к помощнику, которому делегируется выполнение настоящего действия
    app.getGroupHelper().fillGroupForm(new GroupData("Test10", "Test20", "Test30"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
