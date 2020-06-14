<%@ page import="cn.xyz.web.severltb.UserServlet" %><%--
  Created by IntelliJ IDEA.
  User: Hasee
  Date: 2020/3/3
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/news.css">

    <%-- ${pageContext.request.contextPath}  绝对路径引入js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery3.1.js"></script>
    <title>fffffdsfsf</title>
  </head>
  <body>

  <div class="news_content">
      <div class="news_title">title</div>
  </div>

  <%
     out.print(333);
  %>
  </body>
</html>
