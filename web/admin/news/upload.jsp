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
    <title>fffffdsfsf</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<body>

<div id="myEditor"  name="myEditor" class="myEditor" >
    <script id="editor"  type="text/plain" style="width:1024px;height:500px;"></script>
</div>

<script type="text/javascript">
    /*实例化编辑器 */
    var ue = UE.getEditor('editor');

</script>




<%
    out.print(123);
%>
</body>

</html>
