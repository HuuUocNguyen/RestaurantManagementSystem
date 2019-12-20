/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_model;

import java.lang.annotation.Annotation;
import model.Account;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hazard
 */
public class AccountTest implements Test {
    
    private Account account;
    
    public AccountTest() {
    }
    
    @Test
    public void testGetID() {
        account = new Account();
        account.setIDAccount(1);
        assertTrue(account.getIDAccount() == 1);
    }

    @Test
    public void testGetUserName() {
        account = new Account();
        account.setUserName("edenhazard");
        assertFalse(account.getUserName().equals("edenHazard"));
    }
    @Test
    public void testGetPassWord() {
        account = new Account();
        account.setPassWord("1234");
        assertTrue(account.getPassWord().equals(1234));
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Override
    public Class<? extends Throwable> expected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public long timeout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
