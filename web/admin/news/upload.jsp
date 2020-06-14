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
<<<<<<< HEAD:out/artifacts/jweb3_war_exploded/admin/news/news.jsp
    <title>fffffdsfsf</title>
      <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>
=======
    <title>uplaod_jsp</title>
      <script type="text/javascript" src="${pageContext.request.contextPath}/ueidtor/ueditor.config.js"></script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/ueidtor/ueditor.all.js"></script>
>>>>>>> 终于调试ueidtor成功，上传图片显示正常了:web/admin/news/upload.jsp

      <script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>
  </head>
  <body>
 <!--
  <form id="person" method="post" action="" enctype="multipart/form-data">
    <div id="myEditor"  name="myEditor" class="myEditor" >
        <script id="editor"  type="text/plain" style="width:1024px;height:300px;"></script>
    </div>
  </form>
  -->

 <form method="post" action="${pageContext.request.contextPath}/UpdateServlet/imgdd" enctype="multipart/form-data">
   选择一个文件:
   <input type="file" name="uploadFile" />
   <br/><br/>
   <input type="submit" value="上传" />
 </form>

    <script type="text/javascript">
        /*实例化编辑器 */
<<<<<<< HEAD:out/artifacts/jweb3_war_exploded/admin/news/news.jsp
        var ue = UE.getEditor('editor');

=======
        //var ue = UE.getEditor('editor');
>>>>>>> 终于调试ueidtor成功，上传图片显示正常了:web/admin/news/upload.jsp
    </script>




      <%
         out.print("upload_jsp测试页面");
      %>
  </body>

</html>
