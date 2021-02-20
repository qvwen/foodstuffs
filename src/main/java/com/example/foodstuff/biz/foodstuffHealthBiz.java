package com.example.foodstuff.biz;

import com.example.foodstuff.dao.foodstuffHealthDao;
import com.example.foodstuff.pojo.foodstuffHealthModel;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

@Service
public class foodstuffHealthBiz {
    @Resource
    foodstuffHealthDao healthDao;

    public PageInfo<foodstuffHealthModel> queryHealthALL(){
        PageHelper.startPage(1, 6);
        PageInfo<foodstuffHealthModel> info =   new PageInfo<foodstuffHealthModel>(healthDao.queryHealthALL());
        return info;
    }
}
