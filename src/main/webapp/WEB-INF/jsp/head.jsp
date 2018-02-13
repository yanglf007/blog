<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/11
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<head>
    <title><%=request.getParameter("title")%></title>
    <meta charset="UTF-8">
    <link type="image/x-icon" rel="shortcut icon" href="#">
    <link type="text/css" rel="stylesheet" media="all" href="../css/blogbootstrap.css">
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <link href="../css/jingmi.css" rel="stylesheet" type="text/css">
    <link href="../css/lanrenzhijia.css" rel="stylesheet" type="text/css">
    <link href="../css/font-awesome.css" rel="stylesheet" type="text/css">
    <link href="../css/social-share.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../js/jquery_3.3.1.js"></script>
    <script type="text/javascript" src="../js/popper_1.13.0.js"></script>
    <script type="text/javascript" src="../js/social-share-1.0.2"></script>
    <script type="text/javascript" src="../js/move-top.js"></script>
    <script type="text/javascript" src="../js/easing.js"/>

    <script>
        $(function(){
           var el = document.getElementById("share-area");
           var links = [{
               plugin:'github',
               url:'https://github.com/yanglf007'
           },
               {
                   plugin:'weibo',
                   url:'https://weibo.com/9527'
               },{
                   plugin:'facebook',
                   args:{
                       id:'lifeng.yanglf'
                   }
               }];
           var options = {
               size:'sm'
           };
           window.socialShare(el,links,options);
        });
        jQuery(document).ready(function ($) {
            $(".scorll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top}, 1000);
            });
        });
    </script>

    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <%--seo--%>
    <meta name="title" content="yanglf007 | 杨立峰的个人博客">
    <meta name="keywords" content="杨立峰,yanglf007,java,日志">
    <meta name="description" content="杨立峰的个人日志">
    <meta name="author" content="杨立峰">
</head>
<body>
<div class="top-nav">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapse" data-toggle="collapse"
                data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only"Toggle navigation></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <%--Collect the nav links ,forms, and other content for toggling--%>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li>
                        <a href="${pageContext.request.contextPath}/index.html"
                        class="<%=request.getParameter("indexactive")%>">主页</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/tech.html?pagenum=1"
                        class="<%=request.getParameter("techactive")%>">技术杂谈</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/life.html?pagenum=1"
                        class="<%=request.getParameter("lifeactive")%>">生活笔迹</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/trip.html"
                        class="<%=request.getParameter("tripactive")%>">旅行</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/log.html"
                        class="<%=request.getParameter("logactive")%>">日志</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/board.html"
                        class="<%=request.getParameter("boardactive")%>">留言板</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/aboutme.html"
                        class="<%=request.getParameter("aboutmeactive")%>">关于我</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/donate.html"
                        class="<%=request.getParameter("donateactive")%>">捐赠</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/weibonpl.html"
                        class="<%=request.getParameter("interestactive")%>">有点意思</a>
                    </li><li>
                        <a href="${pageContext.request.contextPath}/open.html"
                        class="<%=request.getParameter("openactive")%>">开放平台</a>
                    </li>
                </ul>
                <div class="social-icons">
                    <div id="share-area" style="margin-top: -5px"></div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </nav>
</div>

</body>
</html>
