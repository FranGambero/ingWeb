<%-- 
    Document   : index
    Created on : Dec 15, 2018, 7:56:55 PM
    Author     : frangs
--%>

<%@page import="app.ws.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>aaaa</title>
    </head>
    <body>
        <h1>Hello Worldaaaaaaaa!</h1>    <%-- start web service invocation --%><hr/>
    <%
    try {
	app.ws.AlumnoWS_Service service = new app.ws.AlumnoWS_Service();
	app.ws.AlumnoWS port = service.getAlumnoWSPort();
	// TODO process result here
	java.util.List<app.ws.Alumno> result = port.findAll();
	out.println("Result = "+result);
    %> <table border="1">
        <tr>
        <th>Nombre</th>
        <th>Correo</th>
        <th>Ciudad</th>
        </tr> <%
        for(Alumno alumno: result){
         %>   
         <tr>
             <td><%=alumno.getNombre() %></td>
             <td><%=alumno.getEmail() %></td>
             <td><%=alumno.getCiudad() %></td>
         </tr>
            
    <%
        }
%> </table> <%
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <button onclick="location.href='AddAlumno.jsp'">Llévame a otro lado</button>

    </body>
</html>
