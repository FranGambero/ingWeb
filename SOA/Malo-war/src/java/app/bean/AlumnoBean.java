/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bean;

import app.ws.AlumnoWS_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author frangs
 */
@Named(value = "alumnoBean")
@SessionScoped
public class AlumnoBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AlumnoWS/AlumnoWS.wsdl")
    private AlumnoWS_Service service;

    
    
    
    public AlumnoBean() {
    }

    private java.util.List<app.ws.Alumno> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        app.ws.AlumnoWS port = service.getAlumnoWSPort();
        return port.findAll();
    }
    
}
