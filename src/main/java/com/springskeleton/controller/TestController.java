/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.controller;

import com.springskeleton.controller.documentation.ApiDocConstant;
import com.springskeleton.model.First;
import com.springskeleton.service.IEmailService;
import com.springskeleton.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author krystofurr
 */
@Api(value=ApiDocConstant.TEST_NAME, description=ApiDocConstant.TEST_DESCRIPTION)
@Controller
@RequestMapping("/")
public class TestController {
    
    @Resource(name = "testService")
    ITestService testService;
    
    @Resource(name = "emailService")
    IEmailService emailService;
 
    
    @ApiOperation(value=ApiDocConstant.TEST_METHOD1)
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        testService.save(new First(null, "testing"));
        emailService.sendStandardMessage("yourEmail@blah.com",
                                         "myEmail@blah.com",
                                         "Testing Java Mail",
                                         "Testing Java Mail");
        return "index";
    } 
    
    @ApiOperation(value=ApiDocConstant.TEST_METHOD2)
    @RequestMapping(method = RequestMethod.POST)
    public String index2(ModelMap map) {
        map.put("msg", "Hello Spring 4 Web MVC!");
        return "index";
    } 
    
    @ApiOperation(value=ApiDocConstant.TEST_METHOD3)
    @RequestMapping(method = RequestMethod.PUT)
    public String index3(ModelMap map) {
        map.put("msg", "Hello Spring 4 Web MVC!");
        return "index";
    } 
    
    @ApiOperation(value=ApiDocConstant.TEST_METHOD4)
    @RequestMapping(method = RequestMethod.DELETE)
    public String index4(ModelMap map) {
        map.put("msg", "Hello Spring 4 Web MVC!");
        return "index";
    } 
}
