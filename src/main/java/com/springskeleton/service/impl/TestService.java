/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.impl;

import com.springskeleton.dao.ITestDao;
import com.springskeleton.model.First;
import com.springskeleton.service.ITestService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author krystofurr
 */
@Service("testService")
public class TestService extends BaseService implements ITestService {
    
    @Resource(name = "testDao")
    private ITestDao testDao;

    @Override
    public void test() {
        save(new First());
    }

}
