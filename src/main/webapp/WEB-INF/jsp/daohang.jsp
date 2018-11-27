<%--
  Created by IntelliJ IDEA.
  User: lvxiran
  Date: 2018/11/26
  Time: 下午8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="static/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="//res.layui.com/static/css/global.css?t=1542630986927-6" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <style>
        .class_outer{
            display: block;
            position: relative;
            overflow: hidden;
        }
        .class_cover{
            width: 100%;
            height: 100%;
            line-height: 50px;
            padding-left: 5px;
            background-color: rgba(0, 0, 0, .50);
            color: #FFFFFF;
            font-size: 16px;
            position: absolute;
            left: 0px;
            bottom: 0px;
            opacity: 0;
        }
        .class_cover .content{
            text-align: center;
            top: 25%;
            position: absolute;
            left: 30%;
        }
        .class_cover :hover {
            opacity: 1;
        }
    </style>
</head>
<body  class="layui-bg-green" style="font-size: 16px;">
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
<script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
<script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

    <div class="layui-container" style="background-color: #ffffff;color: black;margin-top: 4em;padding: 0px;">
        <!--搜索引擎-->
        <div class="layui-row" style="padding-top: 2em;">
            <div class="layui-col-md6 layui-col-md-offset3">
                <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
                    <ul class="layui-tab-title">
                        <li>百度</li>
                        <li class="layui-this">谷歌</li>
                        <li>必应</li>
                        <li>图片</li>
                        <li>百科</li>
                        <li>种子</li>
                        <li>学术</li>
                    </ul>
                    <div class="layui-tab-content"></div>
                </div>
                <form class="layui-form layui-form-pane" action="">
                    <input type="text" name="title" required lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                </form>
            </div>

        </div>

        <!--网址推荐-->
        <div class="layui-row layui-bg-gray" style="margin-top: 4em;">
            <%--<div class="layui-row" style="padding-top: 2em;">--%>
                <%--<div class="layui-col-md6 layui-col-md-offset3">--%>
                    <%--<button class="layui-btn layui-btn-radius layui-btn-sm layui-btn-primary">原始按钮</button>--%>
                    <%--<button class="layui-btn layui-btn-radius layui-btn-sm layui-btn-primary">原始按钮</button>--%>
                    <%--<button class="layui-btn layui-btn-radius layui-btn-sm layui-btn-primary">原始按钮</button>--%>
                    <%--<button class="layui-btn layui-btn-radius layui-btn-sm layui-btn-primary">原始按钮</button>--%>
                <%--</div>--%>
            <%--</div>--%>

            <div style="padding-top: 2em;padding-bottom: 2em;">
                <div class="layui-row">
                    <div class="layui-col-md1 layui-col-md-offset2">
                        <div>技术</div>
                    </div>
                    <div class="layui-col-md9">
                    <span class="layui-breadcrumb layui-col-space20" lay-separator=" ">
                      <a href="">github</a>
                      <a href="">Stack Overflow</a>
                      <a href="">ibm developer</a>
                    </span>
                    </div>
                </div>
                <div class="layui-row" style="padding-top: 1em;">
                    <div class="layui-col-md1 layui-col-md-offset2">
                        <div>学习</div>
                    </div>
                    <div class="layui-col-md9">
                    <span class="layui-breadcrumb layui-col-space20" lay-separator=" ">
                      <a href="">LeetCode</a>
                      <a href="">极客时间</a>
                      <a href="">网易公开课</a>
                      <a href="">腾讯课堂</a>
                      <a href="">慕课</a>
                      <a href="">MBA智库</a>
                    </span>
                    </div>
                </div>
                <div class="layui-row" style="padding-top: 1em;">
                    <div class="layui-col-md1 layui-col-md-offset2">
                        <div>阅读</div>
                    </div>
                    <div class="layui-col-md9">
                    <span class="layui-breadcrumb layui-col-space20" lay-separator=" ">
                      <a href="">掘金</a>
                      <a href="">阿里UED</a>
                      <a href="">美团技术博客</a>
                      <a href="">简书</a>
                      <a href="">豆瓣</a>
                    </span>
                    </div>
                </div>
                <div class="layui-row" style="padding-top: 1em;">
                    <div class="layui-col-md1 layui-col-md-offset2">
                        <div>平台</div>
                    </div>
                    <div class="layui-col-md9">
                    <span class="layui-breadcrumb layui-col-space20" lay-separator=" ">
                      <a href="">阿里云</a>
                      <a href="">腾讯云</a>
                      <a href="">七牛</a>
                    </span>
                    </div>
                </div>
            </div>

        </div>

        <div class="layui-row">
            <div class="layui-col-md8">
                <a href="javascript:void(0);">
                    <div style="background-image: url('static/img/moon.jpg');height: 15em; background-size: cover; background-position: center center;">
                    </div>
                </a>
            </div>
            <div class="layui-col-md4">
                <a href="#" class="class_outer">
                <%--<a href="https://blog.javalemon.com/" title="作者个人博客">--%>
                    <div style="background-image: url('static/img/mineblog.jpeg');height: 15em; background-size: cover; background-position: center center;">
                    </div>
                    <span class="class_cover"><span class="content">lemon<br>作者的个人博客</span></span>
                </a>
            </div>
        </div>

        <!--
        <fieldset class="layui-elem-field layui-field-title">
            <legend>java脸萌</legend>
        </fieldset>

        <div class="layui-fluid">
            <div class="row layui-col-space12 layui-clear">
                <div class="layui-col-xs6 layui-col-sm6 layui-col-md3">
                    <div class="img-txt">
                        <img style="width: 100%;" src="static/img/mineblog.jpeg" alt="">
                        <h3>java基础</h3>
                    </div>
                </div>
                <div class="layui-col-xs6 layui-col-sm6 layui-col-md3">
                    <div class="img-txt">
                        <img style="width: 100%;" src="static/img/mineblog.jpeg" alt="">
                        <h3>Tomcat</h3>
                    </div>
                </div>
                <div class="layui-col-xs6 layui-col-sm6 layui-col-md3">
                    <div class="img-txt">
                        <img style="width: 100%;" src="static/img/mineblog.jpeg" alt="">
                        <h3>Spring</h3>
                    </div>
                </div>
                <div class="layui-col-xs6 layui-col-sm6 layui-col-md3">
                    <div class="img-txt">
                        <img style="width: 100%;" src="static/img/mineblog.jpeg" alt="">
                        <h3>Nginx</h3>
                    </div>
                </div>

            </div>
        </div>


        <div style="padding: 4em;" class="layui-bg-gray">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">热门搜索</div>
                        <div class="layui-card-body">
                            第一个搜索<br>
                            第二个搜索<br>
                            第三个搜索<br>
                            第四个搜索<br>
                        </div>
                    </div>
                </div>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">热门留言</div>
                        <div class="layui-card-body">
                            极简主义<br>
                            这个导航页看起来不错<br>
                            希望坚持下去
                        </div>
                    </div>
                </div>
            </div>
        </div>
        -->

        <div style="text-align: center; padding: 2em;" class="layui-bg-gray">
            <div class="layui-row ">
                <div class="layui-col-md12">
                    <button class="layui-btn layui-btn-radius layui-btn-warm">留言</button>
                    <button class="layui-btn layui-btn-radius">建议</button>
                    <button data-method="notice" class="layui-btn layui-btn-radius layui-btn-primary">带走我</button>
                </div>
            </div>
        </div>

        <div class="layui-row" style="text-align: center; padding: 2em;">
            <!-- 底部固定区域 -->
            <div class="layui-text layui-word-aux">©2018 javalemon.com - 京ICP备18058334号</div>
        </div>

    </div>

<script src="static/layui/layui.all.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    ;!function(){
        var layer = layui.layer
            ,form = layui.form;

        // layer.msg('Hello World');w
    }();

    layui.use('layer', function() { //独立版的layer无需执行这一句
        var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句

        //触发事件
        var active = {
            notice: function(){
                //示范一个公告层
                layer.open({
                    type: 1
                    ,title: false //不显示标题栏
                    ,closeBtn: false
                    ,area: '300px;'
                    ,shade: 0.8
                    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,btn: ['勾搭一下', '不给机会']
                    ,btnAlign: 'c'
                    ,moveType: 1 //拖拽模式，0或者1
                    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">javaer，创业团队三年经验<br><br>若您对笔者感兴趣，请留下您的工作邮箱，我会尽快联系您。<br><br>我们此后的征途是星辰大海 ^_^<br><br><input type="text" name="email" class="layui-input"/><br><a href="daohang.jsp"><small style="color:#bda1a1">简历附件</small></a></div>'
                    ,success: function(layero){
                        var btn = layero.find('.layui-layer-btn');
                        btn.find('.layui-layer-btn0').attr({
                            href: 'https://blog.javalemon.com/'
                            ,target: '_blank'
                        });
                    }
                });
            }
        }

        $('.layui-btn').on('click', function(){
            var othis = $(this), method = othis.data('method');
            active[method] ? active[method].call(this, othis) : '';
        });

        $('.class_cover').mouseover(function () {
            $(this).css("opacity","1");
        }).mouseout(function () {
            $(this).css("opacity","0");
        })
    });

</script>

</body>
</html>
