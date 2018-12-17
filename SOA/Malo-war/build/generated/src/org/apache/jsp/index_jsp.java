package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.ws.Alumno;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>aaaa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello Worldaaaaaaaa!</h1>    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	app.ws.AlumnoWS_Service service = new app.ws.AlumnoWS_Service();
	app.ws.AlumnoWS port = service.getAlumnoWSPort();
	// TODO process result here
	java.util.List<app.ws.Alumno> result = port.findAll();
	out.println("Result = "+result);
    
      out.write(" <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("        <th>Nombre</th>\n");
      out.write("        <th>Correo</th>\n");
      out.write("        <th>Ciudad</th>\n");
      out.write("        </tr> ");

        for(Alumno alumno: result){
         
      out.write("   \n");
      out.write("         <tr>\n");
      out.write("             <td>");
      out.print(alumno.getNombre() );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(alumno.getEmail() );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(alumno.getCiudad() );
      out.write("</td>\n");
      out.write("         </tr>\n");
      out.write("            \n");
      out.write("    ");

        }

      out.write(" </table> ");

    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <button onclick=\"location.href='AddAlumno.jsp'\">Llévame a otro lado</button>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
