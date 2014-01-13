<%-- 
    Document   : filmGetir
    Created on : 09.Oca.2014, 23:09:54
    Author     : cengiz
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="button2.css"> 
            <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    div.yazi1{
            cursor:pointer;
            display:block;
            width:600px;
            height:500px;
            margin:0px 0px 0px 300px;
            border:1px solid black;
            padding:10px 20px 10px 100px;
        } 
        
        
    </style>
    <title>Kestik</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<br>
    
    
<% request.setCharacterEncoding("UTF-8");
 
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/film?useUnicode=true&characterEncoding=UTF-8";
Connection con = null;
 
try {
 
Class.forName(driver);
 
} catch (Exception e) {
 
System.exit(0);
}
try {
con = DriverManager.getConnection(url, "root", "123456789");
 
} catch (Exception e) {
System.out.println("Mysql Bilgisi : Bağlantı Kurulamadı" + e + "");
System.exit(0);
}
 
%>

<%
request.setCharacterEncoding("UTF-8");
String filmAdi = request.getParameter("filmAdi");
%>
<%
request.setCharacterEncoding("utf-8");
Statement stmt = con.createStatement();
 
ResultSet rs = stmt.executeQuery("SELECT * FROM filmler where filmAdi='" + filmAdi + "' ;");
while (rs.next()) {
%>

 <center><table border="1" bgcolor="#CCFFFF">
                 <tr>
            <td height="50" width="170"><center>Film Adı</center></td>
                <td height="50" width="170"><center><%= rs.getString("filmAdi") %></center></td>
        </tr>
            <tr>
            <td height="50" width="170"><center>Yonetmen</center></td>
            <td height="50" width="170"><center><%= rs.getString("yonetmen") %></center></td>
        </tr>
            <tr>
            <td height="120" width="170"><center>Oyuncular</center></td>
            <td><center>
            <%= rs.getString("oyuncu1") %><br>
            <%= rs.getString("oyuncu2") %><br>
            <%= rs.getString("oyuncu3") %><br>
        
            <%= rs.getString("oyuncu4") %><br>
            <%= rs.getString("oyuncu5") %><br>
            <%= rs.getString("oyuncu6") %></center></td>
        </tr>
            <tr>
            <td height="50" width="170"><center>Film Türü</center></td>
            <td height="50" width="170"><center><%= rs.getString("turu") %></center></td>
        </tr>
            <tr>
            <td height="50" width="170"><center>Film Puanı</center></td>
            <td height="50" width="170"><center><%= rs.getString("puan") %></center></td>
        </tr>
            
        </table></center>
<%}
%>

</body>
</html>
