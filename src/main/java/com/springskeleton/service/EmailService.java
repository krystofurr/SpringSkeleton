/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service;

/**
 *
 * @author krystofurr
 */
public interface EmailService {
    
    public void sendStandardMessage(String to, String from, String subject, String text);

}
