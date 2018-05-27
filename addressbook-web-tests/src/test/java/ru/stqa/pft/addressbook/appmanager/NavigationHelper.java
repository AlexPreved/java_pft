package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pc05 on 27.05.2018.
 */
public class NavigationHelper {
  FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd){
    this.wd = wd;
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
