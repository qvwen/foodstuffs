<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/9
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>首页</title>
    <script src="/foodstuff/js/vue.js"></script>
    <script src="/foodstuff/js/element-ui.js"></script>
    <link  rel="stylesheet" href="/foodstuff/css/element-ui.css">
    <link rel="stylesheet"  href="/foodstuff/icon/iconfont/iconfont.css">
</head>
<body>
<div id="app">
    <el-row>
        <el-col :span="24">
            <el-menu
                    :default-active="activeIndex2"
                    class="el-menu-demo"
                    mode="horizontal"
                    @select="handleSelect"
                    background-color="#545c64"
                    text-color="#fff"
                    active-text-color="#ffd04b">
<%--                <el-menu-item index="1">处理中心</el-menu-item>--%>
                <el-submenu index="1">
                    <template slot="title">
                        <el-avatar src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"></el-avatar>
                    </template>
                    <el-menu-item index="2-1">
                        <i class="el-icon-chat-dot-round"></i>消息中心
                    </el-menu-item>
                    <el-menu-item index="2-2">
                        <i class="el-icon-key"></i>修改密码
                    </el-menu-item>
                    <el-menu-item index="2-3">
                        <i class="el-icon-lock"></i>锁屏
                    </el-menu-item>
                    <el-menu-item index="2-4">
                        <router-link to="/login" style="text-decoration: none;color:#909399">
                            <i class="el-icon-switch-button"></i>注销
                        </router-link>
                    </el-menu-item>
                </el-submenu>
            </el-menu>
        </el-col>
    </el-row>

    <el-row>
        <el-col :span="24">
            <el-carousel :interval="4000" type="card" height="200px">
                <el-carousel-item v-for="item in 6" :key="item">
               <h3 class="medium">
                <c:forEach items="${requestScope.resultData}" var="u">
                   ${u}
               </c:forEach>
               </h3>
                </el-carousel-item>
            </el-carousel>
        </el-col>
    </el-row>
    <el-row>
         <el-col :span="24">
<%--             <span class="iconfont">&#xe722;</span>--%>
             <el-divider><span style="color:#e2cd0b">美食菜单</span></el-divider>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="6" v-for="(o, index) in 12" :key="o">
            <el-card :body-style="{ padding: '0px' }" shadow="hover">
                <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image">
                <div style="padding: 14px;">
                    <span>${requestScope.message}</span>
                    <div class="bottom clearfix">
                        <time class="time">{{ currentDate }}</time>
<%--                        <el-button type="text" class="button">操作按钮</el-button>--%>
                    </div>
                </div>
            </el-card>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="24">
<%--            <span class="iconfont">&#xe722;</span>--%>
            <el-divider><span style="color:#730fe2">厨具</span></el-divider>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="6" v-for="(o, index) in 12" :key="o">
            <el-card :body-style="{ padding: '0px' }" shadow="hover">
                <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image">
                <div style="padding: 14px;">
                    <span>好吃的汉堡</span>
                    <div class="bottom clearfix">
                        <time class="time">{{ currentDate }}</time>
                        <%--                        <el-button type="text" class="button">操作按钮</el-button>--%>
                    </div>
                </div>
            </el-card>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="24">
            <%--            <span class="iconfont">&#xe722;</span>--%>
            <el-divider><span style="color:#3be207">健康饮食推荐</span></el-divider>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="6" v-for="(o, index) in 12" :key="o">
            <el-card :body-style="{ padding: '0px' }" shadow="hover">
                <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image">
                <div style="padding: 14px;">
                    <span>好吃的汉堡</span>
                    <div class="bottom clearfix">
                        <time class="time">{{ currentDate }}</time>
                        <%--                        <el-button type="text" class="button">操作按钮</el-button>--%>
                    </div>
                </div>
            </el-card>
        </el-col>
    </el-row>
</div>
</body>
<script>
    var  app = new Vue({
        el: '#app',
        data:function () {
            return {
                message: 'Hello Vue!',
                activeIndex2: '1',
                currentDate: new Date(),
            }
        },methods: {
            handleSelect:function(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    })
</script>
<style>
    .el-menu {
        border-right: solid 1px #e6e6e6;
        list-style: none;
        position: relative;
        margin: 0;
        height: 50px;
        padding-left: 80%;
        background-color: #FFF;
    }
    .el-carousel__item h3 {
        color: #475669;
        font-size: 14px;
        opacity: 0.75;
        line-height: 150px;
        margin: 0;
    }

    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }

    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }
    .el-menu--horizontal>.el-submenu .el-submenu__title {
        height: 50px;
        line-height: 60px;
        border-bottom: 2px solid transparent;
        color: #909399;
    }
    .time {
        font-size: 13px;
        color: #999;
    }

    /*.bottom {*/
    /*    margin-top: 13px;*/
    /*    line-height: 12px;*/
    /*}*/

    /*.button {*/
    /*    padding: 0;*/
    /*    float: right;*/
    /*}*/

    .image {
        width: 299px;
        height: 200px;
        display: block;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }

    .el-card {
        border: 1px solid #EBEEF5;
        background-color: #FFF;
        color: #303133;
        -webkit-transition: .3s;
        transition: .3s;
        width: 200px;
        height: 280px;
        margin-bottom: 10px;
    }
    .iconfont{
        color: yellow;
    }
</style>
</html>
