<%-- 
    Document   : AddAlumno
    Created on : Dec 15, 2018, 8:34:45 PM
    Author     : frangs
--%>

<%@page import="app.ws.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear alumno</h1>
        <h3>Datos nuevo alumno</h3>
        <table>
            <tr>
                <td>Nombre</td>
                <td>Correo</td>
                <td>Ciudad</td>
            </tr>
        </table>
        
        
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
	app.ws.AlumnoWS_Service service = new app.ws.AlumnoWS_Service();
	app.ws.AlumnoWS port = service.getAlumnoWSPort();
	 // TODO initialize WS operation arguments here
	app.ws.Alumno entity = new Alumno();
	port.create(entity);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
