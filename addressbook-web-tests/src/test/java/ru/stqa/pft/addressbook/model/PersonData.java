package ru.stqa.pft.addressbook.model;

public class PersonData {
  private final String first_name;
  private final String middle_name;
  private final String last_name;
  private final String nickname;
  private final String title;
  private final String company;
  private final String email;

  public PersonData(String first_name, String middle_name, String last_name, String nickname, String title, String company, String email) {
    this.first_name = first_name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.email = email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getMiddle_name() {
    return middle_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getEmail() {
    return email;
  }
}
