<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script language="javascript">
    var xmlhttp;
    function init() {
       // put more code here in case you are concerned about browsers that do not provide XMLHttpRequest object directly
       xmlhttp = new XMLHttpRequest();
    }
    function getdetails() {
        var empno = document.getElementById("empno");
        var url = "http://localhost:8080/rashmoni/service/greeting/" + empno.value+".html";
        xmlhttp.open('GET',url,true);
        xmlhttp.send(null);
        xmlhttp.onreadystatechange = function() {

               var empname =  document.getElementById("empname");
               var age =  document.getElementById("age");
               if (xmlhttp.readyState == 4) {
                  if ( xmlhttp.status == 200) {
                	  
                	  console.log("rest test: "+  xmlhttp.responseText);
                	  empname.value =xmlhttp.responseText;
                	  
                       var det = eval( "(" +  xmlhttp.responseText + ")");
                       
                      
                       
                       if (det.age > 0 ) {
                          empname.value = det.name;
                          age.value = det.age;
                       }
                       else {
                           empname.value = "";
                           age.value ="";
                           alert("Invalid Employee ID");
                       }
                 }
                 else
                       alert("Error ->" + xmlhttp.responseText);
              }
        };
    }
  </script>
  </head>
  <body  onload="init()">
   <h1>Call Employee Service </h1>
   <table>
   <tr>
       <td>Enter Employee ID :  </td>
       <td><input type="text" id="empno" size="10"/>  <input type="button" value="Get Details" onclick="getdetails()"/>
   </tr>
   <tr>
       <td>Enter Name :  </td>
       <td><input type="text" readonly="true" id="empname" size="20"/> </td>
   </tr>

   <tr>
       <td>Employee Age : </td>
       <td><input type="text" readonly="true" id="age" size="10"/> </td>
   </tr>
   </table>
  </body>
</html>