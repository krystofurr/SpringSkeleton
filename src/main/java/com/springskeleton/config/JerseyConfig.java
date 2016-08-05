/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.config;

import com.springskeleton.service.rest.TestServiceEndpointRest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author krystofurr
 */
@ApplicationPath("/rest")
public class JerseyConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(TestServiceEndpointRest.class));
    }
    
}
