<%--
  Created by IntelliJ IDEA.
  User: lvxiran
  Date: 2018/11/14
  Time: 下午8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lemon导航</title>
    <meta content="width=device-width,initial-scale=1,maximum-scale=1" name="viewport">
    <meta content="jsthon" name="author">
    <meta content="一个极简的网址导航，聚合了多种搜索引擎，收录了各种常用网站。分类合理，内容齐全。处处细微，一切都是理所当然。万花筒，一万个人眼里有一万个世界。" name="description">
    <meta content="万花筒,导航,网址导航,导航网站,常用网站,常用网址,大学生导航,程序员导航,设计导航,学习导航" name="keywords">
    <link href="/static/style.css" rel="stylesheet">
    <link href="https://wht.im/assets/img/common/icon_64.png" rel="shortcut icon" type="image/png">
    <link href="https://wht.im/assets/img/common/icon_512.png" rel="apple-touch-icon">
    <script>window.ga = window.ga || function () {
        (ga.q = ga.q || []).push(arguments)
    };
    ga.l = +new Date;
    ga('create', 'UA-69454720-6', 'auto');
    ga('send', 'pageview');</script>
    <script async="" src="/static/analytics.js"></script>
</head>
<body style="background: rgb(185, 215, 234);">
<nav id="site-nav">
    <div class="float-left" id="nav-close"></div>
    <ul class="float-right" id="menu">
        <li><a href="https://wht.im/">首页</a></li>
        <li class="has-submenu"><a href="https://wht.im/#">社交</a>
            <ul class="submenu" style="display: none;">
                <li><a href="https://jsthon.com/" target="_blank">Blog</a></li>
                <li><a href="https://weibo.com/jsthon" target="_blank">Weibo</a></li>
                <li><a href="https://zhuanlan.zhihu.com/wht-im" target="_blank">Zhihu</a></li>
                <li><a href="https://github.com/wht-im" target="_blank">GitHub</a></li>
            </ul>
        </li>
        <li><a href="https://wht.im/contact.html">联系</a></li>
        <li><a href="https://wht.im/about.html">关于</a></li>
    </ul>
</nav>
<div id="site-main">
    <div id="main-overlay"></div>
    <header id="site-header">
        <div class="container">
            <div class="float-left" id="header-logo"><a href="https://wht.im/"><i class="icon-logo"></i></a></div>
            <div class="float-right" id="burger">
                <div id="burger-icon"><span class="icon-bar top"></span> <span class="icon-bar middle"></span> <span
                        class="icon-bar bottom"></span></div>
            </div>
        </div>
    </header>
    <div class="headline search-bar">
        <div class="container">
            <div class="headline-content">
                <div class="search-tab"><span class="baidu">百度</span> <span class="google active">谷歌</span> <span
                        class="bing">必应</span> <span class="image">图片</span> <span class="wiki">百科</span> <span
                        class="torrent">种子</span> <span class="scholar">学术</span></div>
                <form class="search-form" target="_blank" action="https://www.google.com/search"><input
                        class="float-left search-keyword" type="search" autocomplete="off" autofocus="" name="q"
                        placeholder="Google 搜索"> <input class="float-right" type="submit" value="搜索"></form>
            </div>
        </div>
    </div>
    <div class="works">
        <div class="work-link" style="opacity: 1;">
            <div class="container">
                <div class="tab"><span class="common active">常用</span> <span class="amuse">娱乐</span> <span
                        class="study">学习</span> <span class="life">生活</span> <span class="tech">技术</span> <span
                        class="design">设计</span> <i class="icon-cog" id="setting-icon"></i></div>
                <div class="info" style="">
                    <ul>
                        <li>热门</li>
                        <li><a href="https://www.baidu.com/" target="_blank">百度</a></li>
                        <li><a href="https://www.google.com/" target="_blank">谷歌</a></li>
                        <li><a href="https://cn.bing.com/" target="_blank">必应</a></li>
                        <li><a href="https://www.sogou.com/" target="_blank">搜狗</a></li>
                        <li><a href="https://www.toutiao.com/" target="_blank">今日头条</a></li>
                        <li><a href="https://jandan.net/" target="_blank">煎蛋</a></li>
                        <li><a href="http://www.dgtle.com/" target="_blank">数字尾巴</a></li>
                    </ul>
                    <ul>
                        <li>社交</li>
                        <li><a href="https://www.weibo.com/" target="_blank">微博</a></li>
                        <li><a href="https://tieba.baidu.com/" target="_blank">贴吧</a></li>
                        <li><a href="https://www.zhihu.com/" target="_blank">知乎</a></li>
                        <li><a href="https://www.douban.com/" target="_blank">豆瓣</a></li>
                        <li><a href="https://www.v2ex.com/" target="_blank">V2EX</a></li>
                        <li><a href="https://www.jianshu.com/" target="_blank">简书</a></li>
                        <li><a href="https://twitter.com/" target="_blank">Twitter</a></li>
                    </ul>
                    <ul>
                        <li>资讯</li>
                        <li><a href="https://www.163.com/" target="_blank">网易</a></li>
                        <li><a href="http://www.qq.com/" target="_blank">腾讯</a></li>
                        <li><a href="http://www.sina.com.cn/" target="_blank">新浪</a></li>
                        <li><a href="http://www.sohu.com/" target="_blank">搜狐</a></li>
                        <li><a href="http://www.ifeng.com/" target="_blank">凤凰网</a></li>
                        <li><a href="http://www.people.com.cn/" target="_blank">人民网</a></li>
                        <li><a href="http://xinhuanet.com/" target="_blank">新华网</a></li>
                    </ul>
                    <ul>
                        <li>购物</li>
                        <li><a href="https://www.taobao.com/" target="_blank">淘宝</a></li>
                        <li><a href="https://www.jd.com/" target="_blank">京东</a></li>
                        <li><a href="https://www.amazon.cn/" target="_blank">亚马逊</a></li>
                        <li><a href="https://www.suning.com/" target="_blank">苏宁易购</a></li>
                        <li><a href="https://you.163.com/" target="_blank">网易严选</a></li>
                        <li><a href="https://www.mi.com/" target="_blank">小米商城</a></li>
                        <li><a href="https://www.smzdm.com/" target="_blank">什么值得买</a></li>
                    </ul>
                    <ul>
                        <li>视频</li>
                        <li><a href="https://www.youku.com/" target="_blank">优酷</a></li>
                        <li><a href="https://www.iqiyi.com/" target="_blank">爱奇艺</a></li>
                        <li><a href="https://v.qq.com/" target="_blank">腾讯视频</a></li>
                        <li><a href="https://www.bilibili.com/" target="_blank">哔哩哔哩</a></li>
                        <li><a href="https://www.youtube.com/" target="_blank">YouTube</a></li>
                        <li><a href="https://www.douyu.com/" target="_blank">斗鱼直播</a></li>
                        <li><a href="https://www.panda.tv/" target="_blank">熊猫直播</a></li>
                    </ul>
                    <ul>
                        <ul>
                            <li>校园</li>
                            <li><a href="https://www.tsinghua.edu.cn/" target="_blank">清华主页</a></li>
                            <li><a href="http://its.tsinghua.edu.cn/" target="_blank">信息系统</a></li>
                            <li><a href="http://lib.tsinghua.edu.cn/dra/" target="_blank">图书馆</a></li>
                            <li><a href="http://mails.tsinghua.edu.cn/" target="_blank">清华邮箱</a></li>
                            <li><a href="https://sslvpn.tsinghua.edu.cn/" target="_blank">SSLVPN</a></li>
                            <li><a href="http://learn.tsinghua.edu.cn/" target="_blank">网络课堂</a></li>
                            <li><a href="http://www.thubbs.cn/" target="_blank">清华园</a></li>
                        </ul>
                    </ul>
                    <ul>
                        <li>生活</li>
                        <li><a href="https://www.meituan.com/" target="_blank">美团</a></li>
                        <li><a href="https://www.dianping.com/" target="_blank">大众点评</a></li>
                        <li><a href="https://www.ctrip.com/" target="_blank">携程</a></li>
                        <li><a href="https://www.qunar.com/" target="_blank">去哪儿</a></li>
                        <li><a href="https://www.alitrip.com/" target="_blank">飞猪</a></li>
                        <li><a href="https://kyfw.12306.cn/otn/index/init" target="_blank">12306</a></li>
                        <li><a href="https://www.mafengwo.cn/" target="_blank">马蜂窝</a></li>
                    </ul>
                    <ul>
                        <li>便捷</li>
                        <li><a href="https://fanyi.baidu.com/" target="_blank">词典翻译</a></li>
                        <li><a href="http://www.weather.com.cn/live/" target="_blank">天气预报</a></li>
                        <li><a href="https://www.kuaidi100.com/" target="_blank">快递查询</a></li>
                        <li><a href="https://cn.office-converter.com/" target="_blank">在线转换</a></li>
                        <li><a href="https://send.firefox.com/" target="_blank">临时网盘</a></li>
                        <li><a href="https://wx.qq.com/" target="_blank">网页微信</a></li>
                        <li><a href="https://mail.qq.com/" target="_blank">QQ邮箱</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="gallery" data-cols="3" data-height="0.8" data-margin="0"
             style="padding: 0px; position: relative; height: 320px;">
            <div class="entry work-entry w2"
                 style="width: 800px; height: 320px; margin-left: 0px; margin-right: 0px; margin-bottom: 0px; position: absolute; left: 0px; top: 0px;">
                <a href="https://wht.im/about.html">
                    <div class="reveal reveal-in">
                        <div class="entry-image imageBG" data-img="assets/img/works/index/thumb-1.jpg?v=v6ro80"
                             style="background-image: url('assets/img/works/index/thumb-1.jpg?v=v6ro80'); background-size: cover; background-position: center center;"></div>
                        <div class="info">
                            <div class="content">
                                <div class="title">万花筒</div>
                                <div class="cat">一万个人眼里有一万个世界</div>
                            </div>
                        </div>
                    </div>
                </a></div>
            <div class="entry work-entry"
                 style="width: 400px; height: 320px; margin-left: 0px; margin-right: 0px; margin-bottom: 0px; position: absolute; left: 800px; top: 0px;">
                <a href="https://jsthon.com/">
                    <div class="reveal reveal-in">
                        <div class="entry-image imageBG" data-img="assets/img/works/index/thumb-2.jpg?v=v6ro80"
                             style="background-image: url('assets/img/works/index/thumb-2.jpg?v=v6ro80'); background-size: cover; background-position: center center;"></div>
                        <div class="info">
                            <div class="content">
                                <div class="title">Jsthon</div>
                                <div class="cat">作者的个人博客</div>
                            </div>
                        </div>
                    </div>
                </a></div>
        </div>
    </div>
    <footer id="site-footer">
        <div class="container">
            <div class="copy">© <span id="current-year">2018</span>&nbsp;万花筒<br>一万个人眼里有一万个世界</div>
            <div class="social"><a href="https://weibo.com/jsthon" target="_blank" class="social-link"><i
                    class="icon-weibo"></i></a> <a href="https://zhuanlan.zhihu.com/wht-im" target="_blank"
                                                   class="social-link"><i class="icon-zhihu"></i></a> <a
                    href="https://github.com/wht-im" target="_blank" class="social-link"><i
                    class="icon-github-circled"></i></a> <a href="https://jsthon.com/" target="_blank"
                                                            class="social-link"><i class="icon-home"></i></a></div>
        </div>
    </footer>
</div>
<script src="/static/main.js"></script>
<script src="/static/index.js"></script>
</body>
</html>

