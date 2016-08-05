/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.soap.impl;

import com.springskeleton.service.soap.TestServiceWs;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(
        portName = "TestServicePort",
        serviceName = "TestService",
        targetNamespace = "http://test.com/wsdl",
        endpointInterface = "com.springskeleton.service.soap.TestServiceWs")
public class TestServiceEndpoint implements TestServiceWs  {

    @Override
    public int sum(int add1, int add2) {
        return add1 + add2;
    }

    @Override
    public int multiply(int mul1, int mul2) {
        return mul1 * mul2;
    }
}
