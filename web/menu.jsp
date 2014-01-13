<%-- 
    Document   : menu
    Created on : 10.Oca.2014, 00:19:07
    Author     : cengiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>
        <link type="text/css" rel="stylesheet" href="css/indexmenucss.css"/>
        <link type="text/css" rel="stylesheet" href="css/indexanacss.css"/>
    <title>Kestik</title>
    <style>
        div {
    background-color: #E5E5E5;
        }
        div.arama {
            height: 28px;
            width: 223px;
            margin: -40px 0px 0px 1100px;
            padding: 0px auto;
            border:0px solid #000;
            
             
        }
    </style>
</head>
<body>
   
<script src="js/bootstrap.js"></script>


 <div id='cssmenu'>
<ul>
   <li class='active'><a href='index.jsp'><span><b>Anasayfa</b></span></a></li>
   <li class='has-sub'><a href='#'><span><b>Türler</b></span></a>
      <ul>
         <li class='has-sub'><a href='filmler/Dram.jsp'><span>Dram</span></a>
         </li>
         <li class='has-sub'><a href='filmler/Macera.jsp'><span>Macera</span></a>
         </li>
          <li class='has-sub'><a href='filmler/Fantastik.jsp'><span>Fantastik</span></a>
         </li>
          <li class='has-sub'><a href='filmler/Aksiyon.jsp'><span>Aksiyon</span></a>
         </li>
          <li class='has-sub'><a href='filmler/Komedi.jsp'><span>Komedi</span></a>
         </li>
      
          
      </ul>
   </li>
   <li><a href='form.jsp'><span><b>Film Ekle</b></span></a></li>
   <li>
       <div class="arama">
       <form action="filmGetir.jsp">
               <input type="text" id="filmadi" name="filmAdi" placeholder="" class="input-xlarge">
               <input type="submit" name="ara" id="ara" value="Ara" />
            </form>
       </div>
   </li>
  
</ul>
</div>
</body>
</html>
