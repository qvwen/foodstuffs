package com.example.foodstuff.biz;

import com.example.foodstuff.dao.foodstuffMenuDao;
import com.example.foodstuff.pojo.foodstuffMenuModel;

import javax.annotation.Resource;
import java.util.List;

public class foodstuffMenuBiz {
    @Resource
    foodstuffMenuDao menuDao;
    public List<foodstuffMenuModel> getMenuALL(){
        return  menuDao.getMenuALL();
    }
}
