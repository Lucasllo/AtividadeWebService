/**
 * CalculadoraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.calculadora;

public class CalculadoraServiceLocator extends org.apache.axis.client.Service implements br.com.calculadora.CalculadoraService {

    public CalculadoraServiceLocator() {
    }


    public CalculadoraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for calculadora
    private java.lang.String calculadora_address = "http://localhost:8080/AtividadeCalc/services/calculadora";

    public java.lang.String getcalculadoraAddress() {
        return calculadora_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String calculadoraWSDDServiceName = "calculadora";

    public java.lang.String getcalculadoraWSDDServiceName() {
        return calculadoraWSDDServiceName;
    }

    public void setcalculadoraWSDDServiceName(java.lang.String name) {
        calculadoraWSDDServiceName = name;
    }

    public br.com.calculadora.Calculadora getcalculadora() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(calculadora_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcalculadora(endpoint);
    }

    public br.com.calculadora.Calculadora getcalculadora(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.calculadora.CalculadoraSoapBindingStub _stub = new br.com.calculadora.CalculadoraSoapBindingStub(portAddress, this);
            _stub.setPortName(getcalculadoraWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcalculadoraEndpointAddress(java.lang.String address) {
        calculadora_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.calculadora.Calculadora.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.calculadora.CalculadoraSoapBindingStub _stub = new br.com.calculadora.CalculadoraSoapBindingStub(new java.net.URL(calculadora_address), this);
                _stub.setPortName(getcalculadoraWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("calculadora".equals(inputPortName)) {
            return getcalculadora();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://calculadora.com.br", "calculadoraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://calculadora.com.br", "calculadora"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("calculadora".equals(portName)) {
            setcalculadoraEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
