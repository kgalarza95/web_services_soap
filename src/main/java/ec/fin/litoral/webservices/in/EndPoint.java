/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ec.fin.litoral.webservices.in;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlElement;
import org.springframework.stereotype.Service;

/**
 *
 * @author kgalarza
 */
@Service
@WebService(serviceName = "EndPoint")
//@WebService(targetNamespace = "http://example.com/")
public class EndPoint {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "banco")
    public String banco(@WebParam(name = "procedimiento") @XmlElement(required = true, nillable = false) String procedimiento,
            @WebParam(name = "uuid") @XmlElement(required = true, nillable = false) String uuid,
            @WebParam(name = "uuid_trx") @XmlElement(required = true, nillable = false) String uuid_trx,
            @WebParam(name = "parametros") List<String> parametros,
            @WebParam(name = "lista") Object lista) {
        
        return "Hello reponse obj !";
    }
}
