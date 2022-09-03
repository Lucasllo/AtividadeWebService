/**
 * CalculadoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.calculadora;

public interface CalculadoraService extends javax.xml.rpc.Service {
    public java.lang.String getcalculadoraAddress();

    public br.com.calculadora.Calculadora getcalculadora() throws javax.xml.rpc.ServiceException;

    public br.com.calculadora.Calculadora getcalculadora(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
