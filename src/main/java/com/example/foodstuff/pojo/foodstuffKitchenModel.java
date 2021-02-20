package com.example.foodstuff.pojo;

/**
 * 厨具
 * */
public class foodstuffKitchenModel {

  private long kitchenId;
  private String kitchenTitle;
  private String kitchenName;
  private String kitchenImage;
  private String kitchenLink;
  private long userId;
  private String userName;
  private String issueDate;


  public long getKitchenId() {
    return kitchenId;
  }

  public void setKitchenId(long kitchenId) {
    this.kitchenId = kitchenId;
  }


  public String getKitchenTitle() {
    return kitchenTitle;
  }

  public void setKitchenTitle(String kitchenTitle) {
    this.kitchenTitle = kitchenTitle;
  }


  public String getKitchenName() {
    return kitchenName;
  }

  public void setKitchenName(String kitchenName) {
    this.kitchenName = kitchenName;
  }


  public String getKitchenImage() {
    return kitchenImage;
  }

  public void setKitchenImage(String kitchenImage) {
    this.kitchenImage = kitchenImage;
  }


  public String getKitchenLink() {
    return kitchenLink;
  }

  public void setKitchenLink(String kitchenLink) {
    this.kitchenLink = kitchenLink;
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

}
