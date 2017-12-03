<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
   <table width="700" align="center" border="1">
      <tr>
        <td>用户标识：${pagers.tatal }</td>
        <td>用户名</td>
        <td>真实姓名</td>
        <td>用户密码</td>
        <td>用户电话</td>
        <td>用户地址</td>
        <td>用户邮箱</td>
        <td>操作</td>
      </tr>
      <c:if test="${pagers.total le 0 }">
         <tr>
           <td colspan="6">目前还没有用户数据</td>
         </tr>
      </c:if>
      <c:if test="${pagers.total gt 0 }">
         <c:forEach items="${pagers.datas }" var="u">
         <tr>
           <td>${u.id }</td><td>${u.userName }</td>
           <td><a href="${u.id }">${u.realName }</a></td>
           <td>${u.userPassword }</td><td>${u.userTelephone }</td>
           <td>${u.userAdress }</td><td>${u.userEmail }</td>
           <td>
               <a href="${u.id }/update">更新</a> 
               <a href="${u.id }/delete">删除</a>
           </td>
         </tr>
         </c:forEach>
         <tr>
           <td colspan="6">
              <jsp:include page="/inc/pager.jsp">
                 <jsp:param value="users" name="url1"/>
                 <jsp:param value="${pagers.total }" name="items"/>
              </jsp:include>
           </td>
          </tr>
       </c:if>
   </table>
</body>
</html>