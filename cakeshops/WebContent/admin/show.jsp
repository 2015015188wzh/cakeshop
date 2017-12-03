<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户[${user.userName }]详细信息</title>
</head>
<body>
    <table width="700" align="canter" border="1">
      <tr>
        <td>用户标识：</td><td>${user.id }</td>
      </tr>
      <tr>
        <td>用户名：</td><td>${user.userName }</td>
      </tr>
       <tr>
        <td>真实姓名：</td><td>${user.realName }</td>
      </tr>
      <tr>
        <td>用户密码：</td><td>${user.userPassword }</td>
      </tr>
      <tr>
        <td>用户电话：</td><td>${user.userTelephone }</td>
      </tr>
      <tr>
        <td>用户地址：</td><td>${user.userAdress }</td>
      </tr>
       、  <tr>
        <td>用户邮箱：</td><td>${user.userEmail }</td>
      </tr>
    </table>
</body>
</html>