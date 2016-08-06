/*
 * REF: http://docs.spring.io/spring-security/site/docs/4.1.1.RELEASE/guides/html5/helloworld-javaconfig.html
 */
package com.springskeleton.config.security;

import org.springframework.security.web.context.*;

public class SecurityWebApplicationInitializer
      extends AbstractSecurityWebApplicationInitializer {
    
    public SecurityWebApplicationInitializer() {
        super(SpringSecurityConfig.class);
    }
}
