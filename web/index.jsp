<%@ page import="javafx.application.Platform" %>
<%@ page import="list.Players" %>
<%@ page import="list.PlayerList" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28.05.2017
  Time: 01:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%Players players=new Players();
    PlayerList playerList = new PlayerList();%>
<%players=playerList.list();%>
  <%=players.getId()%>
  <%=players.getAd()%>
  <%=players.getSoyad()%>
  <%=players.getNick()%>

  </body>
</html>
