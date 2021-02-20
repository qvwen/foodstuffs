package com.example.foodstuff.pojo;

/**
 * 健康小知识
 * */
public class foodstuffHealthModel {

  private long healthId;
  private String healthTitle;
  private String healthInfo;
  private String healthImage;
  private String userId;
  private String userName;
  private String issueDate;
  private String healthRecommendMonth;


  public long getHealthId() {
    return healthId;
  }

  public void setHealthId(long healthId) {
    this.healthId = healthId;
  }


  public String getHealthTitle() {
    return healthTitle;
  }

  public void setHealthTitle(String healthTitle) {
    this.healthTitle = healthTitle;
  }


  public String getHealthInfo() {
    return healthInfo;
  }

  public void setHealthInfo(String healthInfo) {
    this.healthInfo = healthInfo;
  }


  public String getHealthImage() {
    return healthImage;
  }

  public void setHealthImage(String healthImage) {
    this.healthImage = healthImage;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
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


  public String getHealthRecommendMonth() {
    return healthRecommendMonth;
  }

  public void setHealthRecommendMonth(String healthRecommendMonth) {
    this.healthRecommendMonth = healthRecommendMonth;
  }

}
