package com.example.foodstuff.pojo;


public class foodstuffMenuDetailsModel {

  private long id;
  private String menuDetaileInfo;
  private String menuDetaileImage;
  private int menuId;



  public String getMenuDetaileInfo() {
    return menuDetaileInfo;
  }

  public void setMenuDetaileInfo(String menuDetaileInfo) {
    this.menuDetaileInfo = menuDetaileInfo;
  }


  public String getMenuDetaileImage() {
    return menuDetaileImage;
  }

  public void setMenuDetaileImage(String menuDetaileImage) {
    this.menuDetaileImage = menuDetaileImage;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getMenuId() {
    return menuId;
  }

  public void setMenuId(int menuId) {
    this.menuId = menuId;
  }
}
