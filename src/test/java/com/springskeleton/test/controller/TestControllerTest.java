/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.test.controller;

import com.springskeleton.controller.TestController;
import com.springskeleton.test.category.VerificationTest;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 *
 * @author krystofurr
 */
@Category(VerificationTest.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestControllerTest {

    TestController mockito = null;
    
    @BeforeClass
    public static void setupOnce() {
    }

    @AfterClass
    public static void tearDownOnce() {
    }

    @Before
    public void setUp() {
        
        mockito = mock(TestController.class);
        
        when(mockito.index()).thenReturn("index");
    }

    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testingMethod() {
        String returnString = mockito.index();
        assertThat(returnString, is("index"));
    }
 
}
