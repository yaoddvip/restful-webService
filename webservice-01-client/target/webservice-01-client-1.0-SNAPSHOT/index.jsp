<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/15
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <script>

        function testJsonAddBook(){
            $(document).ready(function(){
                $.ajax({
                    type:"POST",
                    url:"/rest/hello/test1",
                    dataType: "json",
                    contentType: 'application/json',
                    data:JSON.stringify({"id":"1","name":'zs', "age":"18"}),
                    success: function(data, textStatus, jqXHR){
                        alert("以下是从服务器返回的Book对象:\n\n" + JSON.stringify(data));
                    },
                    error: function(jqXHR, textStatus, errorThrown){
                        alert('error: ' + textStatus);
                    }
                });
            })
        }
    </script>
</head>
<body>
    index

    <a href="javascript:testJsonAddBook()">点击</a>
    <br>
    <form action="/rest/hello/test1" method="post">
        <input type="text" name="id"/>
        <br>
        <input type="text" name="name"/>
        <br>
        <input type="text" name="age">
        <br>
        <input type="submit" value="tijiao">
    </form>
</body>
</html>
