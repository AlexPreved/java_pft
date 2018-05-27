package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by pc05 on 23.05.2018.
 *
 *  Этот класс перед каждым тестовым мтеодом инициализирует объект типа ApplicationManager
 *  А после того, как метод отработал, разрушает объект ApplicationManager
 *
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
