<%--
  Created by IntelliJ IDEA.
  User: assemmukhamadi
  Date: 19.02.2021
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome back</title>
</head>
    <body>
    <%
        //allow access only if session exists
        String user = (String) session.getAttribute("email");
        String userName = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if(cookies !=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("email")) userName = cookie.getValue();
                if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
            }
        }
    %>
    <h3>Hi <%=userName %>, Login successful. Your Session ID=<%=sessionID %></h3>
    <br>
    User=<%=user %>
    <br>
<%--    <a href="CheckoutPage.jsp">Checkout Page</a>--%>
    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout" >
    </form>
    </body>
</html>
