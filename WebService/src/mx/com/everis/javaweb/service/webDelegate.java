package mx.com.everis.javaweb.service;

import javax.jws.WebService;


@WebService (targetNamespace="http://service.javaweb.everis.com.mx/", serviceName="webService", portName="webPort")
public class webDelegate{

    mx.com.everis.javaweb.service.web _web = null;

    public webDelegate() {
        _web = new mx.com.everis.javaweb.service.web(); }

}