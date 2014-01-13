<%-- 
    Document   : guzargah_sec
    Created on : 08.Oca.2014, 00:24:40
    Author     : güven
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="button2.css"> 
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <title>JSP Page</title>
    <style>
        div.tablo{
            width:800px;
            height:230px;
            margin:20px 0px 0px 300px;
            border:1px solid black; 
            background-color:#ffffff;
        }
         div.tablo1{
            width:350px;
            height:50px;
            margin:-150px 0px 0px 300px;
            border:px solid black; 
            background-color:#ffffff;
        }
         div.resim{
            cursor:pointer;
            display:block;
            width:227px;
            height:227px; 
            background-image:url(image/tik.jpg);
            background-repeat:none;    
            margin:0px 0px 0px 0px;
            border:1px solid white;
        }
        div.resim:hover{
            background-image:url(image/tik.jpg);
            background-repeat:none; 
        }
    </style>
</head>
<body>
   <%@ include file="menu.jsp" %>

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
String yonetmen = request.getParameter("yonetmen");
String oyuncu1 = request.getParameter("oyuncu1");
String oyuncu2 = request.getParameter("oyuncu2");
String oyuncu3 = request.getParameter("oyuncu3");
String oyuncu4 = request.getParameter("oyuncu4");
String oyuncu5 = request.getParameter("oyuncu5");
String oyuncu6 = request.getParameter("oyuncu6");
String turu = request.getParameter("turu");
String puan = request.getParameter("puan");

%>
<%
request.setCharacterEncoding("utf-8");
Statement stmt = con.createStatement();
 
stmt.executeUpdate("insert into filmler " + "values('"+filmAdi+"','"+yonetmen+"','"+oyuncu1+"','"+oyuncu2+"','"+oyuncu3+"','"+oyuncu4+"','"+oyuncu5+"','"+oyuncu6+"','"+turu+"','"+puan+"')");
 
      

%>

<div class="tablo">
<div class="resim">
                       <p><img scr="image/tik."/></p>
                   </div>
    <div class="tablo1">
    <font size="5"> Film Başarıyla yuklenmiştir.</font>
    </div>
</div>
</body>
</html>


