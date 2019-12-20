/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitest_model;

import java.lang.annotation.Annotation;
import model.Nguoi;
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
public class NguoiTest implements Test {

    Nguoi nguoi;
    
    public NguoiTest() {
        
    }

    @Test
    public void testID() {
        nguoi = new Nguoi();
        nguoi.setIDNguoi(2);
        assertTrue(nguoi.getIDNguoi() == 3);
    }

    @Test
    public void testTen() {
        nguoi = new Nguoi();
        nguoi.setTen("segio ramos");
        assertTrue(nguoi.getTen().equals("Eden Hazard"));
    }

    @Test
    public void testSoDienThoai() {
        nguoi = new Nguoi();
        nguoi.setSoDienThoai("03142687");
        assertTrue(nguoi.getSoDienThoai().equals("012547863345"));
    }

    @Test
    public void testEmail() {
        nguoi = new Nguoi();
        nguoi.setEmail("huuuocn@gmail.com");
        assertTrue(nguoi.getEmail().equals("ehdjele@gmail.com"));
    }

    @Test
    public void testDiaChi() {
        nguoi = new Nguoi();
        nguoi.setDiaChi("ha noi");
        assertTrue(nguoi.getDiaChi().equals("da nang"));
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
