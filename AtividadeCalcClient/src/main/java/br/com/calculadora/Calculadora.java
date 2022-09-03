/**
 * Calculadora.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.calculadora;

public interface Calculadora extends java.rmi.Remote {
    public int soma(int num1, int num2) throws java.rmi.RemoteException;
    public int divisao(int num1, int num2) throws java.rmi.RemoteException;
    public int multiplicacao(int num1, int num2) throws java.rmi.RemoteException;
    public int subtracao(int num1, int num2) throws java.rmi.RemoteException;
}
