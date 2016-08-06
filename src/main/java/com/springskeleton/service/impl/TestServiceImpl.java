/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.impl;

import com.springskeleton.model.First;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.springskeleton.service.TestService;
import com.springskeleton.dao.TestDao;

/**
 *
 * @author krystofurr
 */
@Service("testService")
public class TestServiceImpl extends BaseServiceImpl implements TestService {
    
    @Resource(name = "testDao")
    private TestDao testDao;

    @Override
    public void test() {
        save(new First());
    }

}
