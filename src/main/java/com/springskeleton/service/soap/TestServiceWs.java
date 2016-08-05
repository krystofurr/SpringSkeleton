/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.soap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://test.com/wsdl")
public interface TestServiceWs {

    public int sum(int add1, int add2);

    public int multiply(int mul1, int mul2);
}
