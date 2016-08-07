/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.test.suite;

import com.springskeleton.test.category.VerificationTest;
import com.springskeleton.test.controller.TestControllerTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author krystofurr
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(VerificationTest.class)
//Exclude categories
//@Categories.ExcludeCategory(PerformanceTests.class)
//Include multiple categories
//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({TestControllerTest.class})
public class VerificationTestSuite {
    
}
