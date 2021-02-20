package com.example.foodstuff.biz;

import com.example.foodstuff.dao.foodstuffKitchenDao;
import com.example.foodstuff.pojo.foodstuffKitchenModel;

import javax.annotation.Resource;
import java.util.List;

public class foodstuffKitchenBiz {
    @Resource
    foodstuffKitchenDao kitchenDao;
    public List<foodstuffKitchenModel> getKitchenALL(){
        return  kitchenDao.queryKitchen();
    }
}
