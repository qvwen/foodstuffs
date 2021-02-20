package com.example.foodstuff.pojo;


import java.util.List;

public class foodstuffMenuModel {

  private long menuId;
  private String menuTitle;
  private String menuImage;
  private long userId;
  private String userName;
  private String issueDate;
  private List<foodstuffMenuDetailsModel> menuDetails;

  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }


  public String getMenuTitle() {
    return menuTitle;
  }

  public void setMenuTitle(String menuTitle) {
    this.menuTitle = menuTitle;
  }


  public String getMenuImage() {
    return menuImage;
  }

  public void setMenuImage(String menuImage) {
    this.menuImage = menuImage;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  public List<foodstuffMenuDetailsModel> getMenuDetails() {
    return menuDetails;
  }

  public void setMenuDetails(List<foodstuffMenuDetailsModel> menuDetails) {
    this.menuDetails = menuDetails;
  }
}
