<%-- 
    Document   : form
    Created on : 09.Oca.2014, 00:12:39
    Author     : cengiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/bootstrap-theme.min.css" type="text/css"/>
        <link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css"/>
        <link rel="stylesheet" href="../css/bootstrap.css" type="text/css"/>
        <link rel="stylesheet" href="../css/bootstrap-theme.css" type="text/css"/>
            
    <title>Kestik</title>
    <style>
 
        .saydamArkaplan {
   
    border: 1px dotted #000;
 }
.saydamKutu {
    margin: 10px;
    border: 1px solid #000;
    background-color: #FFF;
    filter: alpha(opacity=50);
    opacity: 0.5;
}
.saydamKutu p {
    margin: 25px;
    font-weight: 700;
}
       
body {
    background-image: url("image/form.jpg");
}
    </style>
</head>
<body>
    <script src="js/bootstrap.js"></script>
    <script src="js/bootstrap.min.js"></script>
<%@ include file="menu.jsp" %>

    <center>
        
        <div class="saydamArkaplan" style="position:absolute; overflow:hidden; left:300px; top:100px; width:700px; height:500px" >
	<div class="saydamKutu" >
      <form class="form-horizontal" action="formdoldur.jsp">
        <fieldset>
          <div id="legend">
            <legend class="">Bilgiler</legend>
          </div>
     
          <!-- Name -->
          <div class="control-group">
            <label class="control-label"  >Film Adı</label>
            <div class="controls">
              <input type="text" id="filmadi" name="filmAdi" placeholder="" class="input-xlarge">
            </div>
          </div>
     
          <!-- Card Number -->
          <div class="control-group">
            <label class="control-label" >Yönetmen Adı</label>
            <div class="controls">
              <input type="text" id="yonetmen" name="yonetmen" placeholder="" class="input-xlarge">
            </div>
          </div>
     
          <table >
        
      <tr>
          <td><div class="control-group">
            <label class="control-label"  >1.Oyuncu</label>
            <div class="controls">
              <input type="text" id="1oyuncu" name="oyuncu1" placeholder="" class="span2">
            </div>
          </div>
          
          
           <!-- CVV -->
          <div class="control-group">
            <label class="control-label"  >2.Oyuncu</label>
            <div class="controls">
              <input type="text" id="2oyuncu" name="oyuncu2" placeholder="" class="span2">
            </div>
          </div>
           
                     <div class="control-group">
            <label class="control-label"  >3.Oyuncu</label>
            <div class="controls">
              <input type="text" id="3oyuncu" name="oyuncu3" placeholder="" class="span2">
            </div>
          </div>
              
              </td>
              <td> <br>
                  <img src="image/film.jpg" alt="" class="img-rounded img-responsive" />
              </td>
          <td><div class="control-group">
            <label class="control-label"  >4.Oyuncu</label>
            <div class="controls">
              <input type="text" id="4oyuncu" name="oyuncu4" placeholder="" class="span2">
            </div>
          </div>
          
          
           <!-- CVV -->
          <div class="control-group">
            <label class="control-label"  >5.Oyuncu</label>
            <div class="controls">
              <input type="text" id="5oyuncu" name="oyuncu5" placeholder="" class="span2">
            </div>
          </div>
           
                     <div class="control-group">
            <label class="control-label"  >6.Oyuncu</label>
            <div class="controls">
              <input type="text" id="6oyuncu" name="oyuncu6" placeholder="" class="span2">
            </div>
          </div>
              
          </td>
       
      </tr>   
    </table>
          
          <br>
          <!-- CVV -->
          <div class="control-group">
            <label class="control-label"  >Türü</label>
            <div class="controls">
              <input type="text" id="turu" name="turu" placeholder="" class="span2">
            </div>
          </div>
          

           
                     <div class="control-group">
            <label class="control-label"  >Puanı</label>
            <div class="controls">
              <input type="text" id="puan" name="puan" placeholder="" class="span2">
            </div>
          </div>
     
          
     
          <!-- Submit -->
          <input type="submit" name="ara" id="ara" value="gönder" />
     
        </fieldset>
      </form>
    </div>
        </div> </center>
</body>
</html>
