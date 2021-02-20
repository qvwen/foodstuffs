package com.example.foodstuff.action;

import com.example.foodstuff.biz.foodstuffHealthBiz;
import com.example.foodstuff.dao.foodstuffHealthDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class indexAction {
    @Resource
    foodstuffHealthBiz healthBiz;
    @GetMapping("index")
    public ModelAndView index(){
        List<String>  resultData = new ArrayList<>();
        resultData.add("测试1");
        resultData.add("测试2");
        resultData.add("测试3");
        resultData.add("测试4");
        System.out.println(healthBiz.queryHealthALL().get(0).getHealthTitle().toString());
        ModelAndView mad = new ModelAndView("index");
        mad.addObject("message", "测试1");
        mad.addObject("resultData", resultData);
        return mad;
    }
}
