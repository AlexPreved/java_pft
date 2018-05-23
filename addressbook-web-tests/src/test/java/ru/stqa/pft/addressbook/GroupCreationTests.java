package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreationTests() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test10", "Test20", "Test30"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
