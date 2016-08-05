/*
 * REF: http://www.javatpoint.com/example-of-sending-email-using-java-mail-api-through-gmail-server
 *
 * This reference configuration was modified to include a 'Configuration' class and utilize
 * the email through a service class
 *
 */
package com.springskeleton.config;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 *
 * @author krystofurr
 */
@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class JavaMailConfig {

    @Autowired
    private Environment env;
    
    @Bean(name = "javaMailSession")
    public Session getJavaMailSession() {
        Session session = Session.getDefaultInstance(getJavaMailProperties(),  
        new javax.mail.Authenticator() {  
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication(env.getRequiredProperty("mail.smtp.username"),
                                                  env.getRequiredProperty("mail.smtp.password"));  
            }  
        });  
        return session;
    }
    
    private Properties getJavaMailProperties() {
        Properties properties = new Properties();

        properties.put("mail.smtp.host", env.getRequiredProperty("mail.smtp.host"));
        properties.put("mail.smtp.socketFactory.port", env.getRequiredProperty("mail.smtp.socketFactory.port"));
        properties.put("mail.smtp.socketFactory.class", env.getRequiredProperty("mail.smtp.socketFactory.class"));  
        properties.put("mail.smtp.auth", env.getRequiredProperty("mail.smtp.auth"));
        properties.put("mail.smtp.port", env.getRequiredProperty("mail.smtp.port"));
    
        return properties;
    }
    
}
