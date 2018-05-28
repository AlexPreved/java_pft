package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pc05 on 27.05.2018.
 */
public class NavigationHelper extends HelperBase{
  FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd){
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
